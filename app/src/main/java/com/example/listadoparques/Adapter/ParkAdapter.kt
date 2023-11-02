package com.example.listadoparques.Adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import com.example.listadoparques.Parques
import com.example.listadoparques.R

class ParkAdapter(val listaDeParques: List<Parques>): RecyclerView.Adapter<ParkViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParkViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return listaDeParques.size
    }

    override fun onBindViewHolder(holder: ParkViewHolder, position: Int) {
        val item = listaDeParques[position]
        holder.render(item)
    }
}