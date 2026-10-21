package com.sofiaverdugo.directory.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.sofiaverdugo.directory.models.User
import com.sofiaverdugo.directory.models.UserRepo

class UserVM(
private val repo: UserRepo
) : ViewModel() {
    private val _users = mutableStateOf<List<User>>(emptyList())
    val users: State<List<User>> = _users
    val myUser: User = repo.getMyUser()
    init {
        loadUsers()
    }
    private fun loadUsers() {
        _users.value = repo.getUsers()
    }
}