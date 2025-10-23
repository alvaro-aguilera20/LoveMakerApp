package com.example.lovemakerapp.ui

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lovemakerapp.ui.screen.RegistroScreen
import com.example.lovemakerapp.ui.screen.ResumenScreen
import com.example.lovemakerapp.viewmodel.UsuarioViewModel

@Composable
fun Navegacion() {
    val navController = rememberNavController()

    // 🔥 Aquí creamos el ViewModel una sola vez
    val usuarioViewModel: UsuarioViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = "registro"
    ) {
        composable(route = "registro") {
            RegistroScreen(navController, usuarioViewModel)
        }
        composable(route = "resumen") {
            ResumenScreen(usuarioViewModel)
        }
    }
}