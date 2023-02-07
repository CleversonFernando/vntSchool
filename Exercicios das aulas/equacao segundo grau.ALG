Algoritmo "equação do segundo grau"

Var

   delta, positiva, negativa: real
   a, b, c: real

funcao calcular_delta: real
var resposta_delta: real
inicio
   resposta_delta <-  (b^2) - 4*a*c
   retorne resposta_delta
fimfuncao

funcao calcular_raiz_positiva(delta: real): real
var resposta_raiz_positiva: real
inicio
   resposta_raiz_positiva <- (-1*b + raizq(delta))/(2*a)
   retorne resposta_raiz_positiva
fimfuncao

funcao calcular_raiz_negativa(delta: real): real
var resposta_raiz_negativa: real
inicio
   resposta_raiz_negativa <- (-1*b - raizq(delta))/(2*a)
   retorne resposta_raiz_negativa
fimfuncao

Inicio

   escreval("Digite valor de A: ")
   leia(a)
   escreval("Digite valor de B: ")
   leia(b)
   escreval("Digite valor de C: ")
   leia(c)

   delta <- calcular_delta
   positiva <- calcular_raiz_positiva(delta: real)
   negativa <- calcular_raiz_negativa(delta: real)

   escreval("Delta: ", delta, " X1: ", positiva, " X2: ", negativa)


Fimalgoritmo