open System

let fib n =
        let mutable a=1
        let mutable b=0
        for i in 1 .. n do
        printfn "  %d" b
        b <- a+b
        a <- b-a

[<EntryPoint>]
let main argv = 
    let n = 8
    printfn "Serie de Fibonacci de %i terminos" n
    fib n
        
    let tecla = Console.ReadKey()
    0 // devolver un código de salida entero