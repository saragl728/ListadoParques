package com.example.listadoparques.Adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.listadoparques.Parques
import com.example.listadoparques.databinding.ItemParqueBinding

class ParkViewHolder(view: View) : RecyclerView.ViewHolder(view) {
val binding = ItemParqueBinding.bind(view)
    fun render(parkModel: Parques){

    }
}