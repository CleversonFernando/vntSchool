Algoritmo "vetores"

Var

   numero: vetor [1..7] de inteiro
   i, j: inteiro
   contador: inteiro

Inicio

   para i de 1 ate 7 faca
      escreval("Digite o ", i , "º numero: ")
      leia(numero[i])
      se (numero[i] % 2 = 0)entao
      fimse
   fimpara

   para j de 1 ate 7 faca
      se(numero[j]% 2 =0) entao
         escreval("Esse numero e par: ", numero[j])
         contador <- contador + 1
      fimse
   fimpara

   escreval("total de numeros pares: ", contador)

Fimalgoritmo