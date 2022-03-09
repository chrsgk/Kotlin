private val <E> MutableList<E>.comer: Unit
    get() {}

fun main(args: Array<String>) {
    println("Hello World!")



    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    var lista: MutableList<String> = mutableListOf("Leon", "Girafa", "Elefante", "Oso", "Caiman")

    println (lista.size)

    println("Estas son  5 categorias de animales Salvajes $lista")

    var listaAnimales: MutableList<String> = mutableListOf("Perro", "Gato", "Conejo", "Vaca", "Cabra")

    println (listaAnimales.size)
    println("Estas son  5 categorias de animales Domesticos $listaAnimales")

    var Perro = Domesticos()
    var Gato = Domesticos()
    var Conejo= Domesticos()
    var Vaca = Domesticos()
    var Cabra = Domesticos()

    var Leon = Animal()
    var Girafa = Animal()
    var Elefante = Animal()
    var Oso = Animal()
    var Caiman = Animal()

    do {

        var actividad:Int= readLine()?.toInt() as Int

        when(actividad){
            1-> Perro.comer()
            2-> Gato.comer()
            3-> Girafa.comer()
            4-> Caiman.comer()
            5-> Leon.correr()
            6-> Elefante.energia()
            7-> Cabra.edad()
            8-> Oso.dormir()
            9-> Conejo.energia()
            10-> Vaca. edad()

            else-> throw IllegalArgumentException("Excepcion Detectada")
        }
    } while (actividad!=100)




}