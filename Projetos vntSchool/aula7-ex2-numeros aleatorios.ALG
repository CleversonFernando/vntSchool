Algoritmo "numeros aleatorios"

Var

   numeros: vetor[1..50] de inteiro
   i, j, aux, soma: inteiro
   media: real
   
Inicio
      para i de 1 ate 50 faca
      aleatorio 0,50
      leia(numeros[i])
      aleatorio off
   fimpara

   //tratar dados
   para i de 1 ate 50 faca
      para j de i+1 ate 50 faca
         se(numeros[i] > numeros[j]) entao
            aux <- numeros[i]
            numeros[i] <- numeros[j]
            numeros[j] <- aux
         fimse
      fimpara
   fimpara
   
   escreval("Numero maior: ", numeros[50])
   escreval("Numero menor: ", numeros[1])

   para i de 1 ate 50 faca
      soma <- soma + numeros[i]
   fimpara

   media <- soma/50
   escreval("Media: ", media:4:2)

Fimalgoritmo