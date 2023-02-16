Algoritmo "Procedimento fibonacci"

Var
   resposta: inteiro
   numero: real
   sequencia: inteiro

procedimento fibo(x: inteiro):inteiro
var
   numero1: inteiro
   numero2: inteiro
   numero3: inteiro

inicio

   numero1 <- -1
   numero2 <- 1

   enquanto (x > 0) faca
      numero3 <- (numero1 +  numero2)
      numero1 <- numero2
      numero2 <- numero3

      escreva(numero3)
      x <- x -1
   fimenquanto
fimprocedimento

Inicio

   escreval("Qual a quantidade de numeros em sequencia? ")
   leia(sequencia)

   fibo(sequencia)

Fimalgoritmo