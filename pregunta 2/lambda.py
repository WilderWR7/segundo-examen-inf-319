def fibonacci(n):
    a=1
    b=0
    for i in range(n):
        print(b)
        b = a+b
        a = b-a
        i += 1

def fibonacciR(n):
    if n == 0:
        return (0)
    if n == 1:
        return(1)
    return (fibonacciR(n-1) + fibonacciR(n-2))

def Imprime(n):
    for i in range(n):
        print(fibonacciR(i))



operacion = lambda funcion, n = 2: funcion(n)

print("Ingrese un valor")
n = int(input())

print("Fibonacci estructurado:")
operacion(fibonacci,n)
# operacion = lambda funcion, n = 2: funcion(n)

print("Fibonacci recursivo:")
operacion(Imprime,n)

