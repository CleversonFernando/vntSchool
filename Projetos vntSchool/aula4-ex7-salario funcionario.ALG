Algoritmo "Salario funcionario"

Var

   nome: caractere
   salario_inicial: real
   aumento_primeiro_ano: real
   aumento_regular: real
   ano_inicial: inteiro
   ano_atual: inteiro
   ano_limite: inteiro
   salario_com_aumento: real
   contador: inteiro

Inicio

   aumento_primeiro_ano <- 0.015
   ano_limite <- 2018
   aumento_regular <- 0.015

   escreval("Digite o nome do funcionario: ")
   leia(nome)
   escreval("Digite o ano inicial: ")
   leia(ano_inicial)
   escreval("Digite o ano atual: ")
   leia(ano_atual)
   escreval("Digite o salario: ")
   leia(salario_inicial)

   contador <- ano_inicial + 1

   enquanto (contador < ano_limite) faca
      salario_com_aumento <- salario_inicial + (salario_inicial * aumento_primeiro_ano)
      escreval("Salario ano de: ", contador, " e de R$", salario_com_aumento:4:2)
      contador <- contador + 1
   fimenquanto

   contador <- ano_atual + 1

   enquanto (ano_limite < contador) faca
      aumento_regular <- (aumento_regular * 2)
      salario_com_aumento <- salario_com_aumento + (salario_com_aumento * aumento_regular)
      escreval("Salario ano de: ", ano_limite, " e de R$", salario_com_aumento:4:2)
      ano_limite <- ano_limite + 1
   fimenquanto

   escreval("Salario anual com aumento funcianario: ", nome)


Fimalgoritmo