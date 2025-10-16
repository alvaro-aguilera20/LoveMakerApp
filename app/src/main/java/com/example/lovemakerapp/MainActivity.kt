package com.example.lovemakerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.lovemakerapp.ui.theme.LoveMakerAppTheme
import androidx.room.Room
import com.example.lovemakerapp.ui.*

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


