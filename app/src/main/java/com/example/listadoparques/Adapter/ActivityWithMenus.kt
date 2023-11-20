package com.example.listadoparques.Adapter

import android.content.Intent
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.listadoparques.AnadirParqueActivity
import com.example.listadoparques.MainActivity
import com.example.listadoparques.R

open class ActivityWithMenus : AppCompatActivity() {
    companion object{
        var actividadActual = 0;
    }

    //sobreescribimos métodos
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //relacionamos la clase con el layout del menú que hennos creado
        val inflater : MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_principal, menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //abrirá una actividad dependiendo de la opción del menú seleccionada
        return when (item.itemId){
            R.id.inicio -> {
                //abre el listado de parques
                val intent = Intent(this, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
                actividadActual = 0;
                startActivity(intent)
                true
            }
            R.id.anadirParque -> {
                //abre el formulario de adición de parque
                val intent = Intent(this, AnadirParqueActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                actividadActual = 1;
                startActivity(intent)
                true
            }

            else -> {
                super.onOptionsItemSelected(item)
            }
        }

    }
}