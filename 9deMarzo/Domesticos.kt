class Domesticos: Animal {

    constructor()


    val Perro: Int= 4
    val Gato: Int = 6
    val Conejo: Int = 120
    val Vaca: Int = 80
    val cabra: Int = 120


    var energia:String = "Mucho"
    var edad:Int = 30

    init {

    }
    constructor(energia:String, edad:Int){
        this.energia = energia
        this.edad = edad
    }

    override fun energia() {
        println("Estoy recargando energia desde aqui!!")

    }

    override fun edad() {
        println("Ya tengo la edad de Jubilación!!")
    }

}