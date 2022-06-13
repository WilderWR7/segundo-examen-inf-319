open System

let rec fibonacci(n: int):int = 
   match n with
   | 0  -> 0
   | 1  -> 1
   | n -> fibonacci (n-1) + fibonacci (n - 2)




[<EntryPoint>]
let main argv = 
   let n = 9
   for i in 0 .. n-1 do
       let valor = fibonacci(i)
       printfn "  %i" valor
   let tecla = Console.ReadKey()
   0 // devolver un código de salida entero