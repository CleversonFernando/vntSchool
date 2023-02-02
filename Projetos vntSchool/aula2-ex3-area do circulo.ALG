Algoritmo "Area do circulo"

Var
   R1, Area: real
   unidade_medida: caractere

Inicio

   escreval("Digite o valor do raio: ")
   leia(R1)
   se(R1 <= 0)entao
      escreval("Valor do raio nao pode ser negativo ou igual a zero")
   senao
   escreval("Digite a unidade de medida: ")
   leia(unidade_medida)

      Area <- pi*(R1^2)

      escreval("Area do circulo: ", Area:4:2, unidade_medida, "²")
   fimse
   
Fimalgoritmo