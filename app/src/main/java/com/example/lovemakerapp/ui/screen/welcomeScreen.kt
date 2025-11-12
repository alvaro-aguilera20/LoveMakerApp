package com.example.lovemakerapp.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lovemakerapp.viewmodel.UsuarioViewModel

@Composable
fun welcomeScreen(navController: NavController){
    Column(Modifier.padding(all = 16.dp)) {

        Text(text = "LOVE MAKER", style = MaterialTheme.typography.titleLarge)

        Button(
            onClick = {

                navController.navigate(route = "registro")

            },
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(text = "ENTER")
        }
    }
}