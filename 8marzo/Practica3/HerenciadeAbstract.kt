open abstract class HerenciadeAbstract:Abstracta {
    constructor()

    open fun restar(){
        println ("Estoy restando desde HerenciaAbstract")

    }
    override fun sumar(a: Int, b: Int): Int {
        TODO("Not yet implemented")
    }
}