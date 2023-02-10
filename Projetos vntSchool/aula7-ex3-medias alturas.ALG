Algoritmo "Medias alturas"

Var

   lista_alunos: vetor[1..5,1..2] de caractere
   lista_altura: vetor[1..5] de real
   sexo: caractere
   i, j, aux: inteiro
   soma, media: real
   contador: inteiro

Inicio

   para i de 1 ate 5 faca
      j <- 1
      escreval("Digite o nome: ")
      leia(lista_alunos[i,j])
      escreval("Digite a altura: ")
      leia(lista_altura[i])
      escreval("Digite o sexo: [F] [M]")
      leia(lista_alunos[i,j+1])
   fimpara

   //tratar dados
   para i de 1 ate 5 faca
      para j de i+1 ate 5 faca
         se(lista_altura[i] > lista_altura[j]) entao
            aux <- lista_altura[i]
            lista_altura[i] <- lista_altura[j]
            lista_altura[j] <- aux
         fimse
      fimpara
   fimpara
   escreval("Quem tem a menor altura e: ",lista_alunos[1], " com ", lista_altura[1], " M")
   escreval("Quem tem a maior altura e: ", lista_alunos[5], " com ", lista_altura[5], " M")

   para i de 1 ate 5 faca
      se(lista_alunos[i,2] = "M") entao
         soma <- soma + lista_altura[i]
         contador <- contador + 1
      fimse
   fimpara
   media <- (soma/contador)
   escreval("Media altura homens: ", media:4:2)
   media <- 0
   soma <- 0
   contador <- 0
   para i de 1 ate 5 faca
      se(lista_alunos[i,2] = "F") entao
         soma <- soma + lista_altura[i]
         contador <- contador + 1
      fimse
   fimpara
   media <- (soma/contador)
   escreval("Media altura mulheres: ", media:4:2)


Fimalgoritmo