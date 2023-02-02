Algoritmo "Google"

Var

   nome: caractere
   salario_atual: inteiro
   salario_novo: real
   aumento: real
   porcentagem_de_aumento: caractere

Inicio

   escreval("Digite seu nome: ")
   leia(nome)
   escreval("digite o seu salario: ")
   leia(salario_atual)

   se(salario_atual <= 0)entao
      escreval("Valor digitado nao e um salario valido!")
   senao

      se(salario_atual <= 15000)entao

         escolha salario_atual
         caso 1000, 2000, 3000
            salario_novo <- salario_atual + (salario_atual * (20/100))
            porcentagem_de_aumento <- "20%"
         caso 4000, 5000, 6000
            salario_novo <- salario_atual + (salario_atual * (15/100))
            porcentagem_de_aumento <- "15%"
         caso 7000, 8000, 9000
            salario_novo <- salario_atual + (salario_atual * (12/100))
            porcentagem_de_aumento <- "12%"
         caso 10000, 11000, 12000
            salario_novo <- salario_atual + (salario_atual * (10/100))
            porcentagem_de_aumento <- "10%"
         caso 13000, 14000, 15000
            salario_novo <- salario_atual + (salario_atual * (7/100))
            porcentagem_de_aumento <- "7%"
         fimescolha
         
         escreval("Nome: ", nome)
         escreval("% de aumento: ", porcentagem_de_aumento, "  Salario atual: ", salario_atual, "  salario novo: ", salario_novo:4:2)
      senao
         escreval("Nome: ", nome, " Nao tem aumento!")
      fimse
   fimse

Fimalgoritmo