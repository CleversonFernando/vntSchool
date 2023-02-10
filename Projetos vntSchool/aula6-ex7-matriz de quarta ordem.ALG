Algoritmo "Matriz de quarta ordem"

Var

   numeros: vetor[1..4,1..4] de inteiro
   i, j: inteiro

Inicio

   para i de 1 ate 4 faca
      para j de 1 ate 4 faca
         escreval("entre com o ", i, "º numero")
         leia(numeros[i,j])
         j <- j + 1
      fimpara
      i <- i + 1
   fimpara
   Escreval("Diagonal principal")
   para i de 1 ate 4 faca
      para j de 1 ate 4 faca
         se(i = j) entao
            escreva( numeros[i,j])
         fimse
         j <- j + 1
      fimpara
      i <- i + 1
   fimpara
   escreval()
   escreva("Matriz")
   para i de 1 ate 4 faca
      escreval()
      para j de 1 ate 4 faca
         escreva( "-", numeros[i,j])
         j <- j + 1
      fimpara
      i <- i + 1
   fimpara
   escreval()
   escreval("Triangulo superior")
   para i de 1 ate 4 faca
      para j de 1 ate 4 faca
         se(i <= j) entao
            escreva( numeros[i,j])
         fimse
         j <- j + 1
      fimpara
      i <- i + 1
   fimpara
   escreval()
   escreval("Triangulo inferior")
   para i de 1 ate 4 faca
      para j de 1 ate 4 faca
         se(i >= j) entao
            escreva( numeros[i,j])
         fimse
         j <- j + 1
      fimpara
      i <- i + 1
   fimpara

Fimalgoritmo