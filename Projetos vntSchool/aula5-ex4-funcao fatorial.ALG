Algoritmo "Funcao fatorial"

Var

   numero: inteiro
   resposta: inteiro

funcao fatorial(numero: inteiro): inteiro
var  resultado, contador, somar: inteiro
inicio

   contador <- numero
   somar <- numero

   enquanto (contador > 0) faca
      resultado <- resultado + somar
      somar <- (somar - 1)
      contador <- (contador - 1)
   fimenquanto
   retorne resultado
fimfuncao

Inicio

   escreval("digite um numero: ")
   leia(numero)

resposta <- fatorial(numero)

   escreval("Fatorial de ", numero, " e: ", resposta)

Fimalgoritmo