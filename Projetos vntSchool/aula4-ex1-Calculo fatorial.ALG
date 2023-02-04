Algoritmo "Calculo fatorial"

Var

   numero: inteiro
   fatorial: inteiro

Inicio
   numero <- 1

   enquanto (numero <> 0)faca

      fatorial <- 1
      escreval("Digite um numero que deseje obter o fatorial: ")
      leia(numero)

      enquanto (numero > 0) faca
         fatorial <- fatorial * numero
         numero <- numero - 1
      fimenquanto

      escreval("Resultado: ", fatorial)
      escreval("Digite [1] para continuar ou [0] para sair!")
      leia(numero)
   fimenquanto

Fimalgoritmo