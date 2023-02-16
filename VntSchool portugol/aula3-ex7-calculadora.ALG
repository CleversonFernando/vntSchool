Algoritmo "Calculadora"

Var

   opcao: inteiro
   numero1, numero2, resultado: real
   operacao: caractere

Inicio

   escreval("Digite o numero para escolher operacao: ")
   escreval("[1] para adicao")
   escreval("[2] para subtracao")
   escreval("[3] para divisao")
   escreval("[4] Para multiplicacao")
   leia(opcao)

   escreval("Entre com o primeiro valor: ")
   leia(numero1)
   escreval("Entre com o segundo valor: ")
   leia(numero2)

   escolha opcao
   caso 1
      operacao <- "Adicao")
      resultado <- numero1 + numero2
   caso 2
      operacao <- "Subtracao")
      resultado <- numero1 - numero2
   caso 3
      operacao <- "Divisao")
      resultado <- numero1 / numero2
   caso 4
      operacao <- "Multiplicacao")
      resultado <- numero1 * numero2
   fimescolha

   escreval("Resultado da operacao de ", operacao, " e de ", resultado)

Fimalgoritmo