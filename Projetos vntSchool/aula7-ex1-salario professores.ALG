Algoritmo "Salario professores"

Var

   nome: vetor[1..5] de caractere
   quantidade_hora: vetor[1..5] de inteiro
   valor_hora: vetor[1..5] de real
   i, j: inteiro
   salario: vetor[1..5] de real
   aux: real

Inicio

   para i de 1 ate 5 faca
      escreval("Entre com o nome do professor: ")
      leia(nome[i])
      escreval("Entre com o valor da hora/aula: ")
      leia(valor_hora[i])
      escreval("entre com a quantidade de horas: ")
      leia(quantidade_hora[i])
   fimpara

   //tratar informacoes
   para i de 1 ate 5 faca
      escreval("Salário professores: ")
      escreval("Nome: ", nome[i])
      salario[i] <- (quantidade_hora[i] * valor_hora[i])
      escreval(salario[i])
   fimpara

   para i de 1 ate 5 faca
      para j de i+1 ate 5 faca
         se(salario[i] > salario[j]) entao
            aux <- salario[i]
            salario[i] <- salario[j]
            salario[j] <- aux
         fimse
      fimpara
   fimpara
   i <- 5
   escreval("Maior salario: ")
   escreval(nome[i], " salario: ", salario[i])

Fimalgoritmo