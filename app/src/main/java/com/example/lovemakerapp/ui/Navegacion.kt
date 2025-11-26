package com.example.lovemakerapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lovemakerapp.viewmodel.*
import com.example.lovemakerapp.ui.screen.*
import com.example.lovemakerapp.data.*
import com.example.lovemakerapp.data.repository.*

@Composable
fun Navegacion() {
    val context = LocalContext.current

    // 1) Crear DB
    val database = remember {
        AppDatabase.getInstance(context)
    }

    // 2) Crear Repository
    val repo = remember {
        UsuarioRepository(database.usuarioDao())
    }

    // 3) Crear ViewModel con Factory
    val factory = remember { UsuarioViewModelFactory(repo) }
    val usuarioViewModel: UsuarioViewModel = viewModel(factory = factory)

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome"
    ) {
        composable("welcome") {
            welcomeScreen(navController)
        }
        composable("registro") {
            RegistroScreen(navController, usuarioViewModel)
        }
        composable("resumen") {
            ResumenScreen(usuarioViewModel = usuarioViewModel)
        }
    }
}