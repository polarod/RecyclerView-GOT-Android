package es.murallaromana.pmdm.recyclerviewejemplo.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import es.murallaromana.pmdm.recyclerviewejemplo.R
import es.murallaromana.pmdm.recyclerviewejemplo.modelos.entidades.Personaje
import org.w3c.dom.Text

class ListaPersonajesAdapter(val personajes: List<Personaje>) : RecyclerView.Adapter<ListaPersonajesAdapter.PersonajesViewHolder>() {
    //lo creamos dentro pq fuera no sirve para nada
    class PersonajesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvNombre = itemView.findViewById<TextView>(R.id.tvNombre)
        val tvTitulo = itemView.findViewById<TextView>(R.id.tvTitulo)
        val ivFoto = itemView.findViewById<ImageView>(R.id.ivFoto)
        val tvApellidos = itemView.findViewById<TextView>(R.id.tvApellidos)
        val tvFamilia = itemView.findViewById<TextView>(R.id.tvFamilia)
        val tvID = itemView.findViewById<TextView>(R.id.tvID)
        val tvURL = itemView.findViewById<TextView>(R.id.tvID)
    }
// este es para crearlo
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajesViewHolder {
        val layoutInflater= LayoutInflater.from(parent.context).inflate(R.layout.item_personaje, parent, false)

        return PersonajesViewHolder(layoutInflater)
    }
//
    override fun onBindViewHolder(holder: PersonajesViewHolder, position: Int) {
        val personaje = personajes.get(position)

        holder.tvNombre.setText(personaje.nombre)
        holder.tvTitulo.setText(personaje.titulo)
    //uso picasso
    // Picasso.get().load(personaje.url).into(holder.ivFoto)
        Picasso.get().load("https://i.pinimg.com/474x/41/cb/62/41cb62f78be6ef35476510c730ffd791.jpg").into(holder.ivFoto)
        holder.tvApellidos.setText(personaje.apellidos)
        holder.tvFamilia.setText(personaje.familia)
        holder.tvID.setText(personaje.id.toString())
        holder.tvURL.setText(personaje.url)
    }
//este metodo te da la cuenta del largo, entonces simplemente podemos igualarlo
    override fun getItemCount() = personajes.size

}