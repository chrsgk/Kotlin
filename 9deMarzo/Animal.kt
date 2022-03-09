open class Animal:Mamifero {
// val is immutable
    //var is mutable
    constructor()

    var Leon: Int= 4
    var Girafa: Int = 6
    var Elefante: Int = 20
    var Oso: Int = 80
    var Caiman: Int = 120


    override fun comer() {
        println("Estoy comiendo desde la casa de los Animales!")

    }

    override fun correr() {

        println("Estoy corriendo hacia la casa para comer")

    }

    override fun dormir() {
        println("Es tiempo para ir a dormir!!")
    }

    override fun energia() {
        println("Hoy tengo mucha energia $Elefante")
    }

    override fun edad() {
        println("Ya tengo la edad de Jubilación ")
    }

}