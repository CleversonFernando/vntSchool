Algoritmo "Media harmonica"

Var
n1, n2, n3, pesoN1, pesoN2, pesoN3, media: real


Inicio

escreval("Digite Nota 1: ")
leia(n1)
escreval("Digite peso nota 1: ")
leia(pesoN1)
escreval("Digite Nota 2: ")
leia(n2)
escreval("Digite peso nota 2: ")
leia(pesoN2)
escreval("Digite Nota 3: ")
leia(n3)
escreval("Digite peso nota 3: ")
leia(pesoN3)

media <- n1*pesoN1 + n2*pesoN2 + n3*pesoN3/3

escreval("Resultado: ", media)

Fimalgoritmo