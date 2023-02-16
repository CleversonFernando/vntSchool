Algoritmo "Programa solidario"

Var

   opcao: inteiro
   valor: real

Inicio

   escreval("Digite o valor para doacao: ")
   escreval("[1] para doar R$10")
   escreval("[2] para doar R$25")
   escreval("[3] para doar R$50")
   escreval("[4] Para doar outro valor")
   escreval("[5] para cancelar")
   leia(opcao)

   escolha opcao
   caso 1
      valor <- 10
   caso 2
      valor <- 25
   caso 3
      valor <- 50
   caso 4
      escreva("Entre o valor a ser doado: ")
      leia(valor)
      se(valor <= 0)entao
         escreval("Numeros negativos e zero nao sao valores validos!")
      fimse
   caso 5
      escreval("Solicitacao cancelada!")

   fimescolha
   se((opcao <= 4) E (opcao <>5) E (valor >0))entao
      escreval("Valor da doacao R$", valor)
      escreval("Muito obrigado pela sua doacao!")

   fimse

Fimalgoritmo