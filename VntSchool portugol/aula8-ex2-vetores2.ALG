Algoritmo "Vetores2"

Var

   numero: vetor[1..8] de inteiro
   i, j, aux: inteiro

Inicio

   para i de 1 ate 8 faca
      aleatorio -100,100
      leia(numero[i])
   fimpara

   para i de 1 ate 8 faca
      escreva(numero[i])
   fimpara
   
   escreval()
   para  i de 1 ate 8 faca
      para j de i+1 ate 8 faca
         se numero[i] > numero[j]entao
            aux <- numero[i]
            numero[i] <- numero[j]
            numero[j] <- aux
         fimse
      fimpara
   fimpara

   para i de 1 ate 8 faca
      escreva(numero[i])
   fimpara
   
   escreval()
   para i de 8 ate 1 faca
      escreva(numero[i])
   fimpara

Fimalgoritmo