Algoritmo "Area do Trapezio"

Var
base1, base2, altura, area: real
unidade_medida: caractere


Inicio
escreval("Unidade de medida: ")
leia(unidade_medida)
escreval("Digite primeira base: ")
leia(base1)
escreval("Digite segunda base: ")
leia(base2)
escreval("Digite a altura: ")
leia(altura)

area <-(base1 + base2)/2 * altura

escreval("Area do trapézio: ", area, unidade_medida,"²")


Fimalgoritmo