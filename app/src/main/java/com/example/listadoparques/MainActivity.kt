package com.example.listadoparques

import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listadoparques.Adapter.ActivityWithMenus
import com.example.listadoparques.Adapter.ParkAdapter
import com.example.listadoparques.databinding.ActivityMainBinding

class MainActivity : ActivityWithMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //para que salga el título de la actividad
        setTitle("Listadoparques")
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        var adapter = ParkAdapter(ListaParques.listaDeParques)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter = adapter

        binding.filtro.addTextChangedListener { filtro ->
            val filtroParque =
                ListaParques.listaDeParques.filter { parques ->
                    parques.nombre.lowercase().contains(filtro.toString().lowercase())
                }
            adapter.actualizarParques(filtroParque)
        }

    }
}