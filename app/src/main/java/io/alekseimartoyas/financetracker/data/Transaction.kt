package io.alekseimartoyas.financetracker.data

class Transaction(val id: Int,
                  val operationType: OperationType,
                  val quantity: Float,
                  val currency: Currency,
                  val category: String,
                  val date: String)  //добавить курс при транзакции или дату