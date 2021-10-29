package es.murallaromana.pmdm.recyclerviewejemplo.modelos.entidades

class Personaje(
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

    fun mostrar():String{
        var idString = id.toString()
        return idString+""+nombre +""+apellidos+""+titulo+""+familia+url

    }
    fun getNombreYApellidos2 () = "$nombre $apellidos"

}

