Algoritmo "Algoritimo contagem inteligente"

Var

   numero_inicial, numero_final: inteiro

Inicio

   escreval("Digite o numero inicial: ")
   leia(numero_inicial)
   escreval("Digite o numero final: ")
   leia(numero_final)

   se(numero_inicial > numero_final)entao
      numero_final <- numero_final + 1
      enquanto (numero_inicial > numero_final) faca
         numero_inicial <- numero_inicial - 1
         escreva(numero_inicial)
      fimenquanto
   senao

      numero_final <- numero_final - 1

      enquanto (numero_final > numero_inicial) faca
         numero_inicial <- numero_inicial + 1
         escreva(numero_inicial)
      fimenquanto
   fimse

Fimalgoritmo