object Hola {
    def fib1(n: Int): Int = n match {
        case 0 => 0
        case 1 => 1
        case _ => fib1(n - 1) + fib1(n - 2)
    }
    def main(args:Array[String]):Unit = {
         var i = 0
         var n = 8
         while(i<n){
            println(fib1(i))
            i=i+1
        }
    }
}