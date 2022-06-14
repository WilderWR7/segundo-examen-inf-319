def fib(n):
    if n == 0:
        return (0)
    if n == 1:
        return(1)
    return (fib(n-1) + fib(n-2))

def imprime(funcion, n):
    for i in range(n):
        print(funcion(i))
    
def ordensuperior(funcion, n):
    funcion(fib,n)


print("Ingrese un valor")
n = int(input())
print("La Serie de Fibonacci es: ")
ordensuperior(imprime,n)