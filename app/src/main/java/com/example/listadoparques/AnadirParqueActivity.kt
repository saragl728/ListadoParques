package com.example.listadoparques

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.listadoparques.databinding.ActivityAnadirParqueBinding

class AnadirParqueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        var binding = ActivityAnadirParqueBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //se debería hacer que el botón añadiera notificaciones al registro
        binding.bGuardar.setOnClickListener {

            //val miDialogo = MiDialogFragment()
            //miDialogo.show(supportFragmentManager, "MiDialogo")


            //tengo que hacer que aparezcan los mensajes en el log si se da a ok


            //nombre
            Log.d("Nombre", binding.nombre.text.toString())

            //teléfono
            Log.d("Teléfono", binding.telefono.text.toString())

            //descripción
            Log.d("Descripción", binding.descripcion.text.toString())

            //web
            Log.d("Web", binding.web.text.toString())

            //se comprueban los checkboxs
            if (binding.cbMascotas.isChecked){
                Log.d("Mascotas", binding.cbMascotas.text.toString())
            }

            if (binding.cbDeportes.isChecked){

                Log.d("Deportes", binding.cbDeportes.text.toString())
            }

            if (binding.cbRestaurante.isChecked){
                Log.d("Restaurantes", binding.cbDeportes.text.toString())
            }

            if (binding.cbParqueInf.isChecked){
                Log.d("Parque infantil", binding.cbParqueInf.text.toString())
            }

            //en caso de que en las opciones de hora estuviera 24 h, se cambiaría el otro
            if (binding.hApertura.selectedItem.toString() == "24 h"){
                //binding.hCierre.selectedItem = "24 h"
            }

            if (binding.hCierre.selectedItem.toString() == "24 h"){
                //binding.hApertura.selectedItem = "24 h"
            }

            //se muestran las horas de cierre y apertura
            Log.d("Hora apertura", binding.hApertura.selectedItem.toString())
            Log.d("Hora de cierre", binding.hCierre.selectedItem.toString())


        }
    }
}