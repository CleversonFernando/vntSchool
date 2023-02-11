Algoritmo "Vetores1"

Var

   numero: vetor[1..10] de inteiro
   i, j, aux: inteiro

Inicio

   para i de 1 ate 10 faca
      aleatorio 1,10
      leia(numero[i])
   fimpara

   para  i de 1 ate 10 faca
      para j de i+1 ate 10 faca
         se numero[i] > numero[j]entao
            aux <- numero[i]
            numero[i] <- numero[j]
            numero[j] <- aux
         fimse
      fimpara
   fimpara

   para i de 1 ate 10 faca
      escreva(numero[i])
   fimpara

Fimalgoritmo