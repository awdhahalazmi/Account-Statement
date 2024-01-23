package com.joincoded.account.Repo

import com.joincoded.account.data.Transaction
import com.joincoded.account.data.TransactionType

    class AccountRepo {
        companion object{



            var dummyAccountLists = listOf(Transaction("Awdhah",TransactionType.Withdrawl,300.0,"Zara Avenues","21-1-2024")
            ,Transaction("Awdhah",TransactionType.Withdrawl,300.0,"Online","21-1-2024"),
                Transaction("Awdhah",TransactionType.Deposit,300.0,"KFH ATM Salwa","22-1-2024"))

        }
    }


