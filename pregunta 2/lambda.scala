object wilder {
    def fibonacciR(n: Int): Int = n match {
        case 0 => 0
        case 1 => 1
        case _ => fibonacciR(n - 1) + fibonacciR(n - 2)
    }
    def imprime(n: Int):Unit = {
        var i = 0
        while(i<n){
            println(fibonacciR(i))
            i=i+1
        }
    }
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
        val a = scala.io.StdIn.readInt()
        println("Fibonacci estructurado.")
        val operacion = (n:Int)=> fibonacci(n)        
        operacion(a)
        println("Fibonacci Recursivo.")
        val operacionRecusiva = (n:Int)=> imprime(n)        
        operacionRecusiva(a)
    }

}