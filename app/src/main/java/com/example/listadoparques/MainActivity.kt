package com.example.listadoparques

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listadoparques.Adapter.ParkAdapter
import com.example.listadoparques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
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