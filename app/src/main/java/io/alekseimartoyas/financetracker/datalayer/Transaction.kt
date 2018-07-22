package io.alekseimartoyas.financetracker.datalayer

class Transaction(val id: Int,
                  val operationType: OperationType,
                  val quantity: Float,
                  val currency: Currency)