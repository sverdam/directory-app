package com.sofiaverdugo.directory

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sofiaverdugo.directory.models.UserRepo
import com.sofiaverdugo.directory.ui.theme.DirectoryTheme
import com.sofiaverdugo.directory.viewmodels.UserVM
import com.sofiaverdugo.directory.viewmodels.UserVMFactory
import com.sofiaverdugo.directory.views.MainScreen

class MainActivity : ComponentActivity() {
    private val viewModel: UserVM by viewModels {
        UserVMFactory(UserRepo())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DirectoryTheme() {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(
                        viewModel = viewModel,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}