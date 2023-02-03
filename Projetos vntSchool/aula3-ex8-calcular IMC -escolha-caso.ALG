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
      resultado <- 15

      escolha (resultado)
      caso < 16
         situacao <- "Magraza grave"
      caso(>= 16) E ( < 17)
         situacao <- "Magraza moderada"
      caso(>= 17) E ( < 18.5)
         situacao <- "Magraza leve"
      caso(>= 18.5) E ( < 25)
         situacao <- "Saldavel"
      caso(>= 25) E ( < 30)
         situacao <- "Sobrepeso"
      caso(>= 30) E ( < 35)
         situacao <- "Obesidade grau I"
      caso(>= 35) E ( < 40)
         situacao <- "Obesidade grau II (Severa)"
      outrocaso
         situacao <- "Obesidade grau III (Morbida)"

      fimescolha
      escreval(situacao)
   fimse

Fimalgoritmo