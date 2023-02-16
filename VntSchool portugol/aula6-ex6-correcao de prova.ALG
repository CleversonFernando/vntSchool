Algoritmo "Correcao de prova"

Var
   medias: vetor[1..3] de real
   resposta: vetor[1..5] de caractere
   nome: vetor[1..3] de caractere
   gabarito: vetor[1..5] de caractere
   i, j, y: inteiro
   soma: real
   media_total: real

Inicio

   escreval("Entre com o gabarito: ")
   para i de 1 ate 5 faca
      escreval("Questao: ", i, " [a][b][c][d][e]")
      leia(gabarito[i])
   fimpara

   escreval("Gabarito: ")
   para i de 1 ate 5 faca
      escreva(gabarito[i])
   fimpara
   escreval()

   y <-1

   escreval("Entre com as respostas dos alunos: ")
   para i de 1 ate 3 faca
      escreval("Nome do aluno: ")
      leia(nome[i])
      soma <- 0
      para j de 1 ate 5 faca
         escreval("Digite a ", j, "ª resposta: ")
         leia(resposta[j])
         se(resposta[j] = gabarito[j]) entao
            soma <- soma + 1
         fimse
      fimpara
      medias[y] <- (soma/5)*10
      y <- y + 1
   fimpara
   para i de 1 ate 3 faca
      media_total <- media_total + medias[i]
   fimpara
   media_total <- (media_total/3)

   i <- 1
   para i de 1 ate 3 faca
      se(medias[i] > media_total)entao
         escreval("Aluno - ", nome[i], " teve nota acima da media!")
         escreval(medias[i])
      fimse
   fimpara
   escreval("Media geral: ", media_total:4:2)

Fimalgoritmo