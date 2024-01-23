package com.joincoded.account

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.joincoded.account.Repo.AccountRepo
import com.joincoded.account.ui.theme.AccountTheme
import com.joincoded.account.uiComposables.AccountCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // var accountList = AccountRepo.dummyAccountLists
        setContent {
            AccountTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AccountList()
                   // Greeting("Android")

                }
            }
        }
    }
}

@Composable
    fun AccountList(modifier: Modifier = Modifier) {
        var accountList = AccountRepo.dummyAccountLists

        LazyColumn {
            item { Text(text = " Details ") }
            itemsIndexed(accountList) { index, account ->
                AccountCard(
                    name = account.name,
                    transactionType = account.transactionType,
                    Amount = account.Amount,
                    detail = account.detail,
                    Date = account.Date,
                    modifier = Modifier
                        .background(if (index % 2 == 0) Color.Gray else Color.LightGray) // Alternating background colors
                        .fillMaxWidth()
                )
                Divider() // Divider line between statements
            }
        }
    }

//    LazyColumn {
//        item { Text(text = " Details ") }
//        items(accountList) {account->
//         AccountCard(name = account.name, transactionType = account.transactionType, Amount = account.Amount, detail = account.detail, Date =account.Date )
//
//        }}











@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AccountTheme {
        Greeting("Welcome to KFH")
    }
}