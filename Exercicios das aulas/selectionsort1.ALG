Algoritmo "SelectionSort1"

Var

   numero: vetor[1..5] de inteiro
   i, j, aux: inteiro

Inicio

   para i de 1 ate 5 faca
      escreval("Digite o ", i , "º numero: ")
      leia(numero[i])
   fimpara

   para i de 2 ate 5 faca
      aux <- numero[i]
      j <- i -1
      enquanto (aux < numero[j]) faca
         numero[j+1] <- numero[j]
         j <- j - 1
         se (j=0) entao
            interrompa
         fimse
      fimenquanto
      numero[j+1] <- aux
   fimpara
   para i de 1 ate 5 faca
      escreval(numero[i])
   fimpara


Fimalgoritmo