namespace Library1

module fibo =
    let rec fibonacciR(n: int):int = 
        match n with
        | 0  -> 0
        | 1  -> 1
        | n -> fibonacciR (n-1) + fibonacciR (n - 2)

    let fibonacci (n: int):string =
        let mutable a=1
        let mutable b=0
        let mutable resultado = "Serie de Fibonacci de "+n.ToString()+" terminos:  " 
        for i in 1 .. n do
            resultado <- resultado+" / "+b.ToString()
            b <- a+b
            a <- b-a
        resultado



type Class1() = 
    member this.X = "F#"
