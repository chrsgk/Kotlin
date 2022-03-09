open class Visibilidad {

    //OPEN No es un Modificador de Visibilidad. Simplemente permite tratarlo con posterioridad

    open var y:Int = 10

    // Modificadores de Visisbilidad

    //PUBLIC _ permite acceder al elemento desde cualquier parte

    public var x:Int = 9

    // INTERNAL - Solo se puede acceder desde el modulo del codigo ( misma carpeta)

    internal  var a:Int = 8

    //PROTECTED - Solo se puede acceder desde la clase que lo define y las calses derivadas

    protected var pi:Double = 3.142

    // PRIVATE- Solo se utiliza desde lña clase donde estamos

    private  var e:Int = 6

}
