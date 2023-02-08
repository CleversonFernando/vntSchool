Algoritmo "Tabuada"

Var

   total, numero, x, i: inteiro

funcao tabuada(numero, i: inteiro): inteiro
var
inicio
   total <- (numero * i)
   retorne total
fimfuncao

Inicio

   escreval("Digite o numero entre [1] e [10]: ")
   leia(numero)
   se((numero > 0) E (numero < 10)) entao
      para i de 1 ate 10 faca
         x <- tabuada(numero,i)
         escreval("Numero ", i , " x",numero," e igual : ", x)
      fimpara
   senao
      escreval("Valor incorreto!")
   fimse

Fimalgoritmo