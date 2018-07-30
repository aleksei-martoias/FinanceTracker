package io.alekseimartoyas.financetracker.data.local

import io.alekseimartoyas.financetracker.data.Currency
import io.alekseimartoyas.financetracker.data.OperationType

class Transaction(val id: Int,
                  val operationType: OperationType,
                  val quantity: Float,
                  val currency: Currency,
                  val category: String,
                  val date: String)  //добавить курс при транзакции или дату