Algoritmo "selectionSort2"

Var

   numero: vetor[1..7] de inteiro
   i, j, y, aux: inteiro

Inicio

   para y de 1 ate 7 faca
      escreval("Digite o ", y , "º numero: ")
      aleatorio -200, 200
      leia(numero[y])
      aleatorio off
   fimpara

   para i de 1 ate 7 faca
      para j de i+1 ate 7 faca
         se (numero[i] > numero[j]) entao
            aux <- numero[i]
            numero[i] <- numero[j]
            numero[j] <- aux
         fimse
      fimpara
   fimpara

   para i de 1 ate 7 faca
      escreval(numero[i])
   fimpara

Fimalgoritmo