Algoritmo "compara preco"

Var

   num, cont, maior, menor: inteiro

Inicio

   cont <- 0
   escreval("Digite 5 numeros: ")
   enquanto cont < 5 faca
      leia(num)
      se( cont =1) entao
         maior <- num
         menor <- num
      fimse
      se(num > maior) entao
         maior <- num
      fimse
      se(num < menor) entao
         menor <- num
      fimse
      cont <- cont +1
   fimenquanto

   escreval("Numero maior e : ", maior, " o menor e: ", menor)

Fimalgoritmo