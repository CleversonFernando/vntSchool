Algoritmo "Nota final maior"

Var

   lista_nota:  vetor [1..4] de inteiro
   lista_nomes: vetor [1..4] de caractere
   numero: inteiro
   nome: caractere
   nota, maior: inteiro
   i, j, y, contador: inteiro

Inicio

   j <- 1
   i <- 1
   y <- 1
   maior <- lista_nota[i]

   escreval("Quantos alunos deseja cadastrar?")
   leia(numero)

   contador <- numero + 1

   enquanto (i < contador) faca

      escreval("Entre com o ", i, "º aluno: ")
      leia(nome)
      escreval("Entre com a nota: ")
      leia(nota)
      lista_nomes[i] <- nome
      lista_nota[i] <- nota
      i <- i + 1
   fimenquanto

   enquanto (j < contador) faca
      se(maior < lista_nota[j])entao
         maior <- lista_nota[j]
      fimse
      j <- j + 1
   fimenquanto

   enquanto (y < contador) faca
      se maior = lista_nota[y]entao
         escreval("Maior nota: ", lista_nomes[y])
      fimse
      y <- y + 1
   fimenquanto
   
Fimalgoritmo