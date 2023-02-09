Algoritmo "Lista de nomes"

Var

   i: inteiro
   nome: vetor[1..10] de caractere
   a: caractere

Inicio

   Asc(a)
   a <- "C"

   para i de 1 ate 10 faca
      escreval("Digite o ", i , "º nome: ")
      leia(nome[i])
   fimpara

   i <- 1
   para i de 1 ate 10 faca
      se(Asc(nome[i]) = Asc(a)) entao
         escreval(nome[i])
      fimse
   fimpara

Fimalgoritmo