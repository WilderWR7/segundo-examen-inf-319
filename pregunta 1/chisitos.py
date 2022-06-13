columna= int(input())
fila=int(input())

cont=0
M=[[ 0 for columna in range (0,columna)]
   for  fila in range (0,fila)]

L=[[ 0 for columna in range (0,columna)]
   for  fila in range (0,fila)]

Resultado=[[ 0 for columna in range (0,columna)]
   for  fila in range (0,fila)]


for i in range (0,columna):
  for j in range (0,fila):
    cont = cont + 1;
    M[i][j]=int(input())

for i in range (0,columna):
  for j in range (0,fila):
    cont = cont + 1;
    L[i][j]= int(input())

for row in range(0,fila): 
    for col in range(0,columna):
        for elt in range(0,columna):
            Resultado[row, col] += M[row, elt] * L[elt, col]



for i in  range(0,fila):
    print(M[i])
print()

for i in range(0,fila):
    print(L[i])
    
print()
for i in range(0,fila):
    print(Resultado[i])