Algoritmo "Formador de triangulos"

Var

   lado1, lado2, lado3: real

Inicio

   escreval("Digite primeiro lado: ")
   leia(lado1)
   escreval("Digite segundo lado: ")
   leia(lado2)
   escreval("Digite terceiro lado: ")
   leia(lado3)

   se((lado1 > 0) E (lado2 > 0) E (lado3 > 0))entao
      se(((lado1 + lado2) > lado3) E ((lado1 + lado3) > lado2) E ((lado2 + lado3) > lado1)) entao
         se((lado1 = lado2) E (lado1 = lado3))entao
            escreval("Triangulo equilatero")
         senao
            se((lado1 <> lado2) E (lado1 <> lado3))entao
               escreval("Triangulo escaleno")
            senao
               escreval("Triangulo isoceles")
            fimse
         fimse
      senao
         escreval("Valores nao formam um triangulo")
      fimse
   senao
      escreval("Zero nao e um valor valido")
   fimse

Fimalgoritmo