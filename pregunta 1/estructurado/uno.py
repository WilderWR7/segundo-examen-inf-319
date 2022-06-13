def fibonacci(n):
    a=1
    b=0
    for i in range(n):
        print(b)
        b = a+b
        a = b-a
        i += 1


print("Ingrese un valor")
n = int(input())
print("La Serie de Fibonacci es: ")
fibonacci(n)