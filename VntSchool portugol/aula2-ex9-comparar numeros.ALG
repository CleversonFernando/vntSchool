Algoritmo "Comparar numeros"

Var

   a, b, c: inteiro

Inicio

   escreval("Digite primeiro numero: ")
   leia(a)
   escreval("Digite segundo numero: ")
   leia(b)
   escreval("Digite terceiro numero: ")
   leia(c)

   se (a = b) entao
      escreval("Letra a e igual b ")
   senao
      escreval("Letra a nao e igual b")
   fimse
   se (a > b) entao
      escreval("Letra a maior que b")
   senao
      escreval("Letra a nao e maior que b")
   fimse
   se (c < b) entao
      escreval("Letra c menor que b ")
   senao
      escreval("Letra c nao e menor que b")
   fimse
   se (c <> b) entao
      escreval("Letra c e diferente de b")
   senao
      escreval("Letra c nao e diferente de b")
   fimse

   escreval("Valores  a:",a, " b:",b, " c:",c)

Fimalgoritmo