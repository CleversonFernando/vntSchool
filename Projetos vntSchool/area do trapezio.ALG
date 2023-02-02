Algoritmo "Area do trapezio"

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

se((base1 <= 0) OU (base2 <= 0) OU (altura <= 0))entao
escreval("Valores nao podem ser negativos ou igual a zero")
senao

area <-(base1 + base2)/2 * altura

escreval("Area do trapezio: ", area, unidade_medida,"²")
fimse

Fimalgoritmo