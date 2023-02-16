Algoritmo "Financiamento"

Var

   salario, financiamento: real

Inicio

   escreval("Digite o valor do salario: ")
   leia(salario)
   escreval("Digite o valor do financiamento: ")
   leia(financiamento)

   se((salario <= 0) OU (financiamento <= 0))entao
      escreval("Valores digitados nao sao valores validos!")
   senao
      se( financiamento <= (salario * 5))entao
         escreval("Financiamento concedido!")
      senao
         escreval("Financiamento negado!")
         fimse
      fimse

Fimalgoritmo