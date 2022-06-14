open System

let rec fibo(n: int):int = 
    match n with
    | 0  -> 0
    | 1  -> 1
    | n -> fibo (n-1) + fibo (n - 2)

let imprime funcion n= 
    for i in 0 .. n-1 do
        let valor = funcion(i)
        printfn "  %i" valor

let ordensuperior funcion n= 
    printfn "Serie de Fibonacci de %i terminos" n
    funcion fibo n

[<EntryPoint>]
let main argv = 
    let n = 9
    ordensuperior imprime n
    let tecla = Console.ReadKey()
    0 // devolver un código de salida entero