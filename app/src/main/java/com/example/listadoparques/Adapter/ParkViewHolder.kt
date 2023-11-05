package com.example.listadoparques.Adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listadoparques.Parques
import com.example.listadoparques.databinding.ItemParqueBinding

class ParkViewHolder(view: View) : RecyclerView.ViewHolder(view) {
val binding = ItemParqueBinding.bind(view)
    fun render(parkModel: Parques){
        binding.DescripcionParque.text = parkModel.descripcion
        binding.nombreParque.text = parkModel.nombre
        Glide.with(binding.fotoParque.context).load(parkModel.direccionImagen).into(binding.fotoParque)

        //evento de hacer click en el parque
        itemView.setOnClickListener{
            Toast.makeText(binding.fotoParque.context, parkModel.nombre, Toast.LENGTH_LONG).show()
        }
    }
}