package com.example.lovemakerapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.lovemakerapp.data.repository.UsuarioRepository

class UsuarioViewModelFactory(
    private val repo: UsuarioRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UsuarioViewModel::class.java)) {
            return UsuarioViewModel(repo) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}