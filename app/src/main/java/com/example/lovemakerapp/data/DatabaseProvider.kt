package com.example.lovemakerapp.data

import android.content.Context
import androidx.room.Room
import com.example.lovemakerapp.data.AppDatabase
import com.example.lovemakerapp.data.repository.UsuarioRepository

object DatabaseProvider {

    @Volatile
    private var database: AppDatabase? = null

    // Obtiene la instancia de la base de datos
    fun getDatabase(context: Context): AppDatabase {
        return database ?: synchronized(this) {
            val instance = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "love_maker_db"
            ).build()

            database = instance
            instance
        }
    }

    // Provee el repositorio
    fun getUsuarioRepository(context: Context): UsuarioRepository {
        val db = getDatabase(context)
        return UsuarioRepository(db.usuarioDao())
    }
}