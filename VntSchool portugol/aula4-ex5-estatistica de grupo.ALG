Algoritmo "Estatistica de grupo"

Var

   quantidade: inteiro
   lista_nome: vetor[1..250] de caractere
   lista_altura: vetor[1..250] de real
   lista_peso: vetor[1..250] de real
   lista_sexo: vetor[1..250] de caractere
   quantidade_homens, quantidade_mulheres: real
   media_peso: real
   maior_pessoa: caractere
   maior_altura: real
   i: inteiro

Inicio

   escreval("Quantidade de pessoas que se deseja fazer a estatistica ate 250: ")
   leia(quantidade)

   i <- quantidade

   enquanto (i > 0) faca
      escreval("Digite o nome: ")
      leia(lista_nome[i])
      escreval("Digite a altura: ")
      leia(lista_altura[i])
      escreval("Digite o peso: ")
      leia(lista_peso[i])
      escreval("Escolha M para masculino ou F para feminino: ")
      leia(lista_sexo[i])
      se((lista_sexo[i] = "M") OU (lista_sexo[i] = "F"))entao
         i <- i - 1
      senao
         escreval("Valores incorretos!")
      fimse

   fimenquanto

   i <- quantidade

   enquanto (i > 0) faca
      se(lista_sexo[i] = "M")entao
         quantidade_homens <- quantidade_homens + 1
      senao
         quantidade_mulheres <- quantidade_mulheres + 1
      fimse
      se(maior_altura < lista_altura[i])entao
         maior_altura <- lista_altura[i]
         maior_pessoa <- lista_nome[i]
      fimse
      media_peso <- media_peso + lista_peso[i]

      i <- i - 1

   fimenquanto
   media_peso <- ((media_peso/quantidade))
   quantidade_homens <- (quantidade_homens / quantidade) * 100
   quantidade_mulheres <- (quantidade_mulheres / quantidade) * 100

   escreval("Quantidade de homens: ", quantidade_homens, "%")
   escreval("Quantidade de mulheres: ", quantidade_mulheres, "%")
   escreval("Media de peso das pessoas: ", media_peso, "Kg")
   escreval("Pessoa mais alta: ", maior_pessoa)

Fimalgoritmo