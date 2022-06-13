def fib(n):
    if n == 0:
        return (0)
    if n == 1:
        return(1)
    return (fib(n-1) + fib(n-2))



print("Ingrese un valor")
n = int(input())
print("La Serie de Fibonacci es: ")
for i in range(n):
    print(fib(i))