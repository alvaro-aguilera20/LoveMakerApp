package com.example.lovemakerapp.data.repository

import com.example.lovemakerapp.model.Usuario
import com.example.lovemakerapp.data.UsuarioDao
import kotlinx.coroutines.flow.Flow

class UsuarioRepository(
    private val usuarioDao: UsuarioDao
) {

    fun obtenerUsuarios(): Flow<List<Usuario>> = usuarioDao.getUsuarios()

    suspend fun insertarUsuario(usuario: Usuario) = usuarioDao.insert(usuario)

    suspend fun borrarUsuario(usuario: Usuario) = usuarioDao.delete(usuario)

    suspend fun actualizarUsuario(usuario: Usuario) = usuarioDao.update(usuario)
}