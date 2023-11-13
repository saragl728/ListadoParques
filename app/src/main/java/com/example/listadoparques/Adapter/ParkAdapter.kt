package com.example.listadoparques.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listadoparques.Parques
import com.example.listadoparques.R

class ParkAdapter(var listaDeParques: List<Parques>): RecyclerView.Adapter<ParkViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParkViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ParkViewHolder(layoutInflater.inflate(R.layout.item_parque, parent, false))
    }

    override fun getItemCount(): Int {
        return listaDeParques.size
    }

    override fun onBindViewHolder(holder: ParkViewHolder, position: Int) {
        val item = listaDeParques[position]
        holder.render(item)
    }

    fun actualizarParques(listaparque: List<Parques>) {
        this.listaDeParques = listaparque
        notifyDataSetChanged()
    }
}