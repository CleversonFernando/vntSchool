Algoritmo "Identificador positivo e negativo"

Var

   numero: inteiro

Inicio

   escreval("Digite um numero: ")
   leia(numero)

   se(numero >= 0)entao
      se(numero % 2 = 0)entao
         escreva("Numero par!")
      senao
         escreva("Numero impar!")
      fimse
   senao
      escreval("Este numero nao e positivo!")
   fimse

Fimalgoritmo