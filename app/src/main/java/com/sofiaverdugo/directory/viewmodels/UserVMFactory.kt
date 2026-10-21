package com.sofiaverdugo.directory.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sofiaverdugo.directory.models.UserRepo

class UserVMFactory(
    private val repo: UserRepo
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UserVM::class.java)) {
            return UserVM(repo) as T
        }
        throw IllegalArgumentException("Unkown ViewModel")
    }
}