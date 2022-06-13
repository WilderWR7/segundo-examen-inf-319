object Hola {
    def fibonacci(n: Int)={
        var a= 1
        var b = 0
        var i=0
        while(i<n){
            println(b)
            b = a+b
            a = b-a
            i = i+1
        }
    }
    def main(args:Array[String]):Unit = {
        println("Ingrese un numero:")
        val n = scala.io.StdIn.readInt()
        println("Serie de Fibonacci es:")
        fibonacci(n)
    }
}