Algoritmo "Media harmonica"

Var

   n1, n2, n3, peso_n1, peso_n2, peso_n3, media: real

Inicio

   escreval("Digite Nota 1: ")
   leia(n1)
   escreval("Digite peso nota 1: ")
   leia(peso_n1)
   escreval("Digite Nota 2: ")
   leia(n2)
   escreval("Digite peso nota 2: ")
   leia(peso_n2)
   escreval("Digite Nota 3: ")
   leia(n3)
   escreval("Digite peso nota 3: ")
   leia(peso_n3)
   se(n1 < 0) OU (n2 < 0) OU (n3 < 0) OU (peso_n1 < 0) OU (peso_n2 < 0) OU  (peso_n3 < 0)entao
      escreval("Valores nao podem ser negativos")
   senao

      media <- ((n1*peso_n1) + (n2*peso_n2) + (n3*peso_n3)) /3

      escreval("Resultado: ", media:4:2)
   fimse

Fimalgoritmo