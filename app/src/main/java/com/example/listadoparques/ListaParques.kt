package com.example.listadoparques

class ListaParques {
    companion object {
        val listaDeParques = listOf<Parques>(
            Parques("Inserte url de imagen aquí", "Parque de ejemplo 1", "Este parque es un placeholder"),
            (Parques("Inserte url de imagen aquí", "Parque de ejemplo 2", "Este parque es un placeholder")),
            (Parques("Inserte url de imagen aquí", "Parque de ejemplo 3", "Este parque es un placeholder")),
            (Parques("Inserte url de imagen aquí", "Parque de ejemplo 4", "Este parque es un placeholder")),
            (Parques("Inserte url de imagen aquí", "Parque de ejemplo 5", "Este parque es un placeholder")))
    }
}