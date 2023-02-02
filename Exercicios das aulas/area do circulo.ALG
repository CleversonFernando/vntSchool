Algoritmo "Area do circulo"

Var

   area, raio: real
   unidade_medida: caractere

Inicio

   escreval("Digite a unidade de medida: ")
   leia(unidade_medida)
   escreval("Digite o valor do raio: ")
   leia(raio)

   se(raio <= 0 )entao
      escreval("Não é possível fazer o cálculo, valor do raio é negativo ou igual a zero!")
   senao
      area <- pi * (raio^2)
      escreval("Valor da area", area:4:2, unidade_medida,"²")
   fimse

Fimalgoritmo