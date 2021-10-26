package es.murallaromana.pmdm.recyclerviewejemplo.modelos.entidades

class Personajes(
    var id: Long,
    var nombre: String,
    var apellidos: String,
    var titulo: String,
    var familia: String,
    var url: String
    ){
   fun getNombreYApellidos ():String{

       return "$nombre $apellidos"

   }
    fun getNombreYApellidos1 ():String{

        return nombre +""+apellidos

    }

    fun getNombreYApellidos2 () = "$nombre $apellidos"

}

