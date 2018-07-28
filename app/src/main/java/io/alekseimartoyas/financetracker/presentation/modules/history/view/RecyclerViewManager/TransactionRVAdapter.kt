package io.alekseimartoyas.financetracker.presentation.modules.history.view.RecyclerViewManager

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import io.alekseimartoyas.financetracker.R
import io.alekseimartoyas.financetracker.R.id.*
import io.alekseimartoyas.financetracker.datalayer.Currency
import io.alekseimartoyas.financetracker.datalayer.OperationType
import io.alekseimartoyas.financetracker.datalayer.Transaction
import io.alekseimartoyas.financetracker.presentation.modules.history.presenter.ITransactionRVInput

class TransactionRVAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>(),
        ITransactionRVInput {

    private var transactionList: Array<Transaction> = arrayOf(
            Transaction(1,
                OperationType.ENLISTMENT,
                159F,
                Currency.USD,
                "correcting",
                "today"),
            Transaction(2,
                    OperationType.DEBIT,
                    5F,
                    Currency.USD,
                    "Food",
                    "today"))

    override fun setData(transactions: Array<Transaction>) {
        transactionList = transactions
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater
                .from(parent.context)
                .inflate(R.layout.card_transaction, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return transactionList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ViewHolder) {
            for (item in transactionList) {
                holder.categoryText.text = item.category
                holder.currencyText.text = item.currency.toString()
                holder.operationTypeText.text = item.operationType.toString()
                holder.quantityCurrencyText.text = item.quantity.toString()
            }
        }
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val categoryText = view.findViewById<TextView>(category_text)!!
        val operationTypeText = view.findViewById<TextView>(operation_type_text)!!
        val quantityCurrencyText = view.findViewById<TextView>(quantity_currency_spinner)!!
        val currencyText = view.findViewById<TextView>(currency_text)!!
    }
}