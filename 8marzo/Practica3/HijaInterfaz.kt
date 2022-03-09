class HijaInterfaz: Interface, HerenciadeAbstract {

    constructor()

    override var resultado: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun area() {
        TODO("Not yet implemented")
    }

    override fun perimetro() {
        TODO("Not yet implemented")
    }

    override fun sumar(x: Int, y: Int): Int {
        TODO("Not yet implemented")
    }

    override fun restar() {
        println("Estoy restando desde HijaInterfaz")
    }

}