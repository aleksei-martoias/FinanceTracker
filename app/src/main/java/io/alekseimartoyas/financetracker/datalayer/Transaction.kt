package io.alekseimartoyas.financetracker.datalayer

import java.util.*

class Transaction(val id: Int,
                  val operationType: OperationType,
                  val quantity: Float,
                  val currency: Currency,
                  val category: String,
                  val date: String)  //добавить курс при транзакции или дату