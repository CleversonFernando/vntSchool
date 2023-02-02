Algoritmo "Media semestral"

Var

   nota1, nota2, nota3, media: real

Inicio

   escreval("Digite valor da primeira nota: ")
   leia(nota1)
   escreval("Digite o valor da segunda nota: ")
   leia(nota2)
   escreval("Digite o valor sa terceira nota: ")
   leia(nota3)

   se((nota1 < 0) OU (nota2 < 0) OU (nota3 < 0))entao
      escreval("Valores de nota nao podem ser negativos!")
   senao
      se((nota1 > 10) OU (nota2 > 10) OU (nota3 > 10))entao
         escreval("Valores de nota nao podem ser maiores que 10!")
      senao

         media <- ((nota1 + nota2 + nota3)/3)

         se(media >= 7)entao
            escreval("Aluno aprovado!")
         senao
            se(media < 5)entao
               escreval("Aluno reprovado!")
            senao
               escreval("Aluno de recuperacao!")
            fimse
         fimse
         escreval("Nota: ", media:4:2)
      fimse
   fimse


Fimalgoritmo