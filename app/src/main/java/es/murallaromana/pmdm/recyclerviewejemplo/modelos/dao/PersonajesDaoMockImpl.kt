package es.murallaromana.pmdm.recyclerviewejemplo.modelos.dao

import es.murallaromana.pmdm.recyclerviewejemplo.modelos.entidades.Personaje

class PersonajesDaoMockImpl():PersonajesDao {

// get todos igualando al listOf
    override fun getTodos() = listOf(
        Personaje(0,"Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen","uw"),
        Personaje(0,"Samwell", "Tarly", "Maester", "House Tarly", "uwu"),
        Personaje(0,"Arya", "Stark", "No One", "House Stark","uwu"),
        Personaje(0,"Brienne", "Tarth", "Briene of Tarth", "Tarth", "uwu"))



/*
//get todos con return listof
        return listOf(
            Personaje(0,"Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen","uw"),
            Personaje(0,"Samwell", "Tarly", "Maester", "House Tarly", "uwu"),
            Personaje(0,"Arya", "Stark", "No One", "House Stark","uwu"),
            Personaje(0,"Brienne", "Tarth", "Briene of Tarth", "Tarth", "uwu"))*/
//get todos con un return mitico
//        val p = Personaje(0,"Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen","uw")
//        val p1 = Personaje(0,"Samwell", "Tarly", "Maester", "House Tarly", "uwu")
//        val p2 = Personaje(0,"Arya", "Stark", "No One", "House Stark","uwu")
//        val p3 = Personaje(0,"Brienne", "Tarth", "Briene of Tarth", "Tarth", "uwu")
//
//        val personajes = listOf(p,p1,p2,p3)
//
//        return personajes
    fun prueba(){
    var lista = ArrayList<Personaje>()
    lista.add( Personaje(0,"Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen","uw"))

    }

}