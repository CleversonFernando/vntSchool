Algoritmo "Procedimento ordem crescente"

Var

   numero1, numero2, numero3, numero4: inteiro

procedimento ordem_crescente

var i, aux: inteiro

inicio

   i <- 1
   enquanto (i > 0) faca
      se((numero1 > numero2) OU (numero2 > numero3) OU (numero3 > numero4)) entao
         se( numero1 >= numero2)entao
            aux <- numero2
            numero2 <- numero1
            numero1 <- aux
         fimse
         se( numero2 >= numero3)entao
            aux <- numero3
            numero3 <- numero2
            numero2 <- aux
         fimse
         se( numero3 >= numero4)entao
            aux <- numero4
            numero4 <- numero3
            numero3 <- aux
         fimse
      fimse
      se(((numero1 < numero2) OU (numero1 = numero2)) E ((numero2 < numero3) OU (numero2 = numero3)) E ((numero3 < numero4) OU (numero3 = numero4))) entao
         i <- 0
      fimse
   fimenquanto
fimprocedimento

Inicio

   escreval("Digite primeiro numero: ")
   leia(numero1)
   escreval("Digite segundo numero: ")
   leia(numero2)
   escreval("Digite terceiro numero: ")
   leia(numero3)
   escreval("Digite quarto numero: ")
   leia(numero4)

   ordem_crescente

   escreval(numero1, numero2, numero3, numero4)

Fimalgoritmo