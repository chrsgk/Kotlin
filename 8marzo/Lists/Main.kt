fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val lista: List<String> = listOf("Avion", "Coche", "Camion")

    println(lista.size)
    println(lista.first())
    println(lista.last())
    println(lista.get(1))

    val listaMutable:MutableList<String?> = mutableListOf("Avion", "Coche", "Camion")

    println(listaMutable.size)
    println(listaMutable.first())
    println(listaMutable.last())
    println(listaMutable.get(1))

    listaMutable.add("Tren")
    println(listaMutable.size)

    println("Antes" + listaMutable[1])
    listaMutable [1] = "Taxi"
    println("Despues" + listaMutable[1])
    listaMutable.add(null)

    println("ELEMENTOS LISTA NULL Y STRING TOTALES:"+ listaMutable.size)

    // podemos crear una lista mutable nueva wue filtre los elementos que no sean Null
    var listaMutableSinNull:List<String> = listaMutable.filterNotNull()

    println("ELEMENTOS NO NULL: "+ listaMutableSinNull.size)

    println(listaMutable.filterNotNull().size)

    var numero = 7



}