package com.example.listadoparques.Adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listadoparques.ListaParques.Companion.listaDeParques
import com.example.listadoparques.Parques

class ParkAdapter(val listaDeParques: List<Parques>): RecyclerView.Adapter<ParkViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParkViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return listaDeParques.size
    }

    override fun onBindViewHolder(holder: ParkViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}