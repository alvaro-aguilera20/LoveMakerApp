package com.example.lovemakerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.lovemakerapp.ui.Navegacion
import com.example.lovemakerapp.ui.theme.*

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoveMakerAppTheme { // <- aquí va el nombre de TU TEMA, lo puedes encontrar en ui/theme/Theme.kt
                Navegacion()
            }
        }
    }



}


