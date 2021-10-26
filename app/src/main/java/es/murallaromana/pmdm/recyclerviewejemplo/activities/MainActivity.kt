package es.murallaromana.pmdm.recyclerviewejemplo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import es.murallaromana.pmdm.recyclerviewejemplo.R
import es.murallaromana.pmdm.recyclerviewejemplo.databinding.ActivityMainBinding
import es.murallaromana.pmdm.recyclerviewejemplo.modelos.entidades.Personajes

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val layoutManager =  LinearLayoutManager(this)

        // prueba personaje
        val p = Personajes(0,"loco","qlowasky","mykewasozsky","puta","la mia",)
        println(p.getNombreYApellidos())

    }
}