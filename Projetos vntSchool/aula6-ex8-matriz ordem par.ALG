Algoritmo "Matriz ordem par"

Var

   numeros:vetor[1..3, 1..3] de inteiro
   i, j, pares: inteiro

Inicio


   para i de 1 ate 3 faca
      para j de 1 ate 3 faca
         escreval("Digite um numero: ")
         leia(numeros[i,j])
      fimpara
   fimpara

   escreval()
   escreval("Matriz")
   pares <- 0
   para i de 1 ate 3 faca
      para j de 1 ate 3 faca
         se(numeros[i,j] % 2 = 0) entao
            escreva("(",numeros[i,j],")")
            pares <- pares +1
         fimse
      fimpara
   fimpara
   escreval()
   escreval("Quantidade numeros pares:")
   escreva(pares)

Fimalgoritmo