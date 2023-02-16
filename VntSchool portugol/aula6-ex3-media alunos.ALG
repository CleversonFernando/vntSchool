Algoritmo "media alunos"

Var

   aluno: vetor[1..5] de caractere
   media_nota: vetor[1..5] de real
   nota1, nota2, soma: real
   media_turma: real
   i, j, y: inteiro

Inicio

   i <- 1
   j <- 1
   y <- 1

   para i de 1 ate 5 faca
      escreval("Entre com o nome do " ,i,"º aluno: ")
      leia(aluno[i])
      escreval("Entre com a primeira nota: ")
      leia(nota1)
      escreval("Entre com a segunda nota: ")
      leia(nota2)
      media_nota[i] <- ((nota1 + nota2)/2)
   fimpara

   para j de 1 ate 5 faca
      soma <- (soma + media_nota[j])
   fimpara

   media_turma <- soma/j
   escreval("Resultado da media alunos: ", media_turma)

   para y de 1 ate 5 faca
      se(media_nota[y] > media_turma) entao
         escreval("O aluno, ", aluno[y], " teve nota acima da media, nota: ", media_nota[y])
      fimse
   fimpara

Fimalgoritmo