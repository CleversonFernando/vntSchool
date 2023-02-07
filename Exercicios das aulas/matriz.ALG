Algoritmo "matriz"

Var

   valores: vetor [1..3, 1..3] de inteiro
   i,j: inteiro
   somar_coluna2: inteiro
   somar_linha3:  inteiro
   total_matriz: inteiro
   somar_diagonal: inteiro

Inicio

   para i de 1 ate 3 faca
      para j de 1 ate 3 faca
         Escreval("Digite um numero: ")
         leia(valores[i,j])
         total_matriz <- total_matriz + valores[i,j]
         se(j=2)entao
            somar_coluna2 <- somar_coluna2 + valores[i,j]
         fimse
         se(i=3) entao
            somar_linha3 <- somar_linha3 + valores[i,j]
         fimse
         se(i = j)entao
            somar_diagonal <- somar_diagonal + valores[i,j]
         fimse
      fimpara
   fimpara

   para i de 1 ate 3 faca
      para j de 1 ate 3 faca
         escreva(" -", valores[i,j])
      fimpara
      escreval
   fimpara

   escreval("Soma matriz: ", total_matriz)
   escreval("Soma coluna 2: ", somar_coluna2)
   escreval("Soma linha 3: ", somar_linha3)
   escreval ("Soma diagonal: ", somar_diagonal)

Fimalgoritmo