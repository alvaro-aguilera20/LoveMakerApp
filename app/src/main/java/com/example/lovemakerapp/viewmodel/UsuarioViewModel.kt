package com.example.lovemakerapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lovemakerapp.data.repository.UsuarioRepository
import com.example.lovemakerapp.model.Usuario
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

data class UsuarioFormState(
    val nombre: String = "",
    val correo: String = "",
    val clave: String = "",
    val direccion: String = "",
    val aceptaTerminos: Boolean = false
)

class UsuarioViewModel(private val repository: UsuarioRepository) : ViewModel() {

    private val _form = MutableStateFlow(UsuarioFormState())
    val form: StateFlow<UsuarioFormState> = _form

    fun onNombreChange(valor: String) { _form.value = _form.value.copy(nombre = valor) }
    fun onCorreoChange(valor: String) { _form.value = _form.value.copy(correo = valor) }
    fun onClaveChange(valor: String) { _form.value = _form.value.copy(clave = valor) }
    fun onDireccionChange(valor: String) { _form.value = _form.value.copy(direccion = valor) }
    fun onAceptarTerminosChange(valor: Boolean) { _form.value = _form.value.copy(aceptaTerminos = valor) }

    fun registrarUsuario(onSuccess: () -> Unit) = viewModelScope.launch {
        val u = _form.value
        val usuario = Usuario(
            nombre = u.nombre,
            correo = u.correo,
            clave = u.clave,
            direccion = u.direccion
        )

        repository.insertarUsuario(usuario)
        onSuccess()
    }
}