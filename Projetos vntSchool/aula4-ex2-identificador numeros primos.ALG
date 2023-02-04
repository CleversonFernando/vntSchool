Algoritmo "Identificador numeros primos"

Var

   numero: inteiro
   cont: inteiro
   i: inteiro

Inicio

   i <- 1
   escreval("Digite um numero: ")
   leia(numero)

enquanto (numero >= i) faca
      se(numero % i = 0)entao
         cont <- cont + 1
         fimse
         i <- i + 1
fimenquanto
   
   se(cont = 2)entao
      escreval("Numero primo!")
   senao
      escreval("Nao e numero primo!")
   fimse
   
Fimalgoritmo