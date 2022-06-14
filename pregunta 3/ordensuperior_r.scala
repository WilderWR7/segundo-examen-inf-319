object Hola {
    def fib1(n: Int): Int = n match {
        case 0 => 0
        case 1 => 1
        case _ => fib1(n - 1) + fib1(n - 2)
    }
    def imprime(n: Int):Unit={
        var i = 0
         while(i<n){
            println(fib1(i))
            i=i+1
        }
    }

    def ordensuperior(funcion:(Int)=>Unit):Unit={
        funcion(scala.io.StdIn.readInt())
    }
    def main(args:Array[String]):Unit = {

    	ordensuperior(imprime)

    }
}

