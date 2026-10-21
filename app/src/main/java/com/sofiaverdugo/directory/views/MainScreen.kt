package com.sofiaverdugo.directory.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.PrimaryTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.sofiaverdugo.directory.viewmodels.UserVM

@Composable
fun MainScreen(
    viewModel: UserVM,
    modifier: Modifier = Modifier
) {
    var tab by rememberSaveable { mutableIntStateOf(0) }
    Column(modifier = modifier) {
        PrimaryTabRow(selectedTabIndex = tab) {
            Tab(
                selected = tab == 0,
                onClick = { tab = 0 },
                text = { Text(text = "All") }
            )
            Tab(
                selected = tab == 1,
                onClick = { tab = 1 },
                text = { Text(text = "My Profile") }
            )
        }
        if (tab == 0) {
            UsersScreen(users = viewModel.users.value)
        } else {
            ProfileScreen(user = viewModel.myUser)
        }
    }
}