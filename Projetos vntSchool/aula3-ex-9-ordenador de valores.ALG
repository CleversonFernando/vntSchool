Algoritmo "Ordenador de valores"

Var

   i, a, b, c, maior, menor, medio: inteiro

Inicio

   escreval("Digite valor de I: ")
   escreval("Opcoes [1]-Crescente [2]-Decescente [3]-Maior entre ")
   leia(i)

   se((i = 1) OU (i = 2) OU ( i = 3))entao
      escreval("Primeiro numero: ")
      leia(a)
      escreval("Segundo numero: ")
      leia(b)
      escreval("Terceiro numero: ")
      leia(c)

      se(a > b) E (b > c)entao
         maior <- a
         medio <- b
         menor <- c
      senao
         se(b > a) E (a > c)entao
            maior <- b
            medio <- a
            menor <- c
         senao
            se(c > a) E (a > b)entao
               maior <- c
               medio <- a
               menor <- b
            senao
               se(b > a) E (c > b)entao
                  maior <- c
                  medio <- b
                  menor <- a
               senao
                  se(a > c) E (c > b)entao
                     maior <- a
                     medio <- c
                     menor <- b
                  fimse
               fimse
            fimse
         fimse
      fimse
      escolha (i)
      caso 1
         escreval(menor, medio, maior)
      caso 2
         escreval(maior, medio, menor)
      caso 3
         escreval(menor, maior, medio)
      fimescolha
   senao
      escreval("Opcao inesistente!")
   fimse

Fimalgoritmo
