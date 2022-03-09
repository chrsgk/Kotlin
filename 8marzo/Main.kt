fun main(args: Array<String>) {
    println("Hello colectiones!")

    //val numeros = arrayOf(2,4,6,8)
    val numeros:Array<Int> = arrayOf(2,4,6,8)
    println(numeros[2])

    val numeros2 =arrayOfNulls<String> (4)
    numeros2[1] = "Maria"
    numeros2 [2] = null
    numeros2 [1] = "Paco"

    val personas = Array<Persona>(5){index ->
        when (index){
            0 -> Persona("Mucha", 17)
            1 -> Persona("Poca", 29)
            2 -> Persona("Mucha", 5)
            3 -> Persona("Poca", 55)
            4 -> Persona("Mucha", 2)
            5 -> Persona("Mucha", 26)
            6 -> Persona("Bastante", 24)
            else-> throw IllegalArgumentException("Excepcion Detectada")
        }

    }
    println(personas.joinToString(""))
    println(personas.contentToString())

    
   // println(numeros2[1])

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}