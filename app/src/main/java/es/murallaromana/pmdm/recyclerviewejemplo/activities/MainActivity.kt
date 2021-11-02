package es.murallaromana.pmdm.recyclerviewejemplo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.squareup.picasso.Picasso
import es.murallaromana.pmdm.recyclerviewejemplo.adapters.ListaPersonajesAdapter
import es.murallaromana.pmdm.recyclerviewejemplo.databinding.ActivityMainBinding
import es.murallaromana.pmdm.recyclerviewejemplo.modelos.dao.PersonajesDao
import es.murallaromana.pmdm.recyclerviewejemplo.modelos.dao.PersonajesDaoMockImpl
import es.murallaromana.pmdm.recyclerviewejemplo.modelos.entidades.Personaje

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Inflo las vistas
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //obtengo los datos de los personajes
        val personajesDao = PersonajesDaoMockImpl()
        val listaPersonajes = personajesDao.getTodos()

        //Creo los componentes del RecyclerView
        val layoutManager =  LinearLayoutManager(this)
        val adapter = ListaPersonajesAdapter(listaPersonajes)

        //Asocio el RVIEW con sus componentes
        binding.rvListaPersonajes.adapter = adapter
        binding.rvListaPersonajes.layoutManager = layoutManager







    }
}