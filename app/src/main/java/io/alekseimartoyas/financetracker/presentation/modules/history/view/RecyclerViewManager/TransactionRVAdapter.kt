package io.alekseimartoyas.financetracker.presentation.modules.history.view.RecyclerViewManager

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import io.alekseimartoyas.financetracker.R
import io.alekseimartoyas.financetracker.data.Transaction
import io.alekseimartoyas.financetracker.presentation.modules.history.presenter.ITransactionRVInput

class TransactionRVAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>(),
        ITransactionRVInput {

    private var transactionList: Array<Transaction> = arrayOf()

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
            holder.categoryText.text = transactionList[position].category
            holder.currencyText.text = transactionList[position].currency.toString()
            holder.operationTypeText.text = transactionList[position].operationType.toString()
            holder.quantityCurrencyText.text = transactionList[position].quantity.toString()
        }
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val categoryText = view.findViewById<TextView>(R.id.category_text)!!
        val operationTypeText = view.findViewById<TextView>(R.id.operation_type_text)!!
        val quantityCurrencyText = view.findViewById<TextView>(R.id.currency_quantity_text)!!
        val currencyText = view.findViewById<TextView>(R.id.currency_text)!!
    }
}