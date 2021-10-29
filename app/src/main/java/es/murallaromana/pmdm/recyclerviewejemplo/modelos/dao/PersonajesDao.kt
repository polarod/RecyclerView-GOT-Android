package es.murallaromana.pmdm.recyclerviewejemplo.modelos.dao

import es.murallaromana.pmdm.recyclerviewejemplo.modelos.entidades.Personaje

interface PersonajesDao {
    //public List<personaje> getTodos/getAll()

    fun getTodos(): List<Personaje>

}