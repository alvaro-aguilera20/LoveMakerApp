package com.example.lovemakerapp.data

import androidx.room.*
import com.example.lovemakerapp.model.Usuario
import kotlinx.coroutines.flow.Flow

@Dao
interface UsuarioDao {

    @Query("SELECT * FROM usuarios")
    fun getUsuarios(): Flow<List<Usuario>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(usuario: Usuario)

    @Update
    suspend fun update(usuario: Usuario)

    @Delete
    suspend fun delete(usuario: Usuario)
}