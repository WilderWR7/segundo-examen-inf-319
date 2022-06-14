object Hola {
    def fibo(n: Int):Unit={
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
    def ordensuperior(funcion:(Int)=>Unit):Unit={
        funcion(scala.io.StdIn.readInt())
    }
    def main(args:Array[String]):Unit = {
        ordensuperior(fibo)
    }
}