Algoritmo "Numeros perfeitos"

Var

   contador: inteiro
   numero: inteiro
   soma: inteiro
   i: inteiro

Inicio

   i <- 1
   contador <- 0

   escreval("Digite a partir de qual numero deseja começar: ")
   leia (numero)

   enquanto (contador <  4) faca
      enquanto (i < numero) faca
         se (numero % i = 0)entao
            soma <- soma + i
         fimse
         i <- i + 1
      fimenquanto
      se (soma = numero)entao
         contador <- contador + 1
         escreval(numero, " e um numero perfeito!")
      fimse
      numero <- numero + 1
      soma <- 0
      i <- 1
   fimenquanto

Fimalgoritmo