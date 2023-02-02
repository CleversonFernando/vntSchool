Algoritmo "Conversao de moeda"

Var

   reais, euros, cambio: real

Inicio

   escreval("Digite valor em reais: ")
   leia(reais)
   escreval("Digite cambio do EUR: ")
   leia(cambio)
   se(reais <= 0) OU (cambio <= 0)entao
      escreval("Valores não podem ser negativos ou igual a zero")
   senao

      euros <- reais / cambio

      escreval("Valor em Euros: ", euros:4:2, " EUR")
   fimse

Fimalgoritmo