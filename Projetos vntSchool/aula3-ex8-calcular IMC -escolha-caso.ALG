Algoritmo "Calculo IMC escolha-caso"

Var

   massa, altura, resultado: real
   situacao: caractere

Inicio

   escreval("Digite o seu peso: ")
   leia(massa)
   escreval("Digite sua altura: ")
   leia(altura)

   se((massa <= 0) OU (altura <= 0))entao
      escreval("Valores negativos ou zero nao sao valores validos!")
   senao
   
      resultado <- massa / altura^2

      escolha resultado
      caso 1 ate 15,9
         situacao <- "Magraza grave"
      caso 16 ate 16,9
         situacao <- "Magraza moderada"
      caso 17 ate 18.4
         situacao <- "Magraza leve"
      caso 18.5 ate 24.9
         situacao <- "Saldavel"
      caso 25 ate 29.9
         situacao <- "Sobrepeso"
      caso 30 ate 34.9
         situacao <- "Obesidade grau I"
      caso 35 ate 39.9
         situacao <- "Obesidade grau II (Severa)"
      outrocaso
         situacao <- "Obesidade grau III (Morbida)"

      fimescolha
      escreval(situacao)
   fimse

Fimalgoritmo