Algoritmo "Calcular IMC"

Var

   massa, altura, resultado: real

Inicio

   escreval("Digite o seu peso: ")
   leia(massa)
   escreval("Digite a sua altura: ")
   leia(altura)

   se((massa <= 0) OU (altura <= 0))entao
      escreval("Valores digitados nao podem ser negativos ou zero!")
   senao

      resultado <- massa / altura^2

      escreval("Situacao do paciente: ")

      se(resultado < 16)entao
         escreval("Magreza grave")
      senao
         se((resultado >= 16) E (resultado < 17))entao
            escreval("Magreza moderada")
         senao
            se((resultado >= 17) E (resultado < 18.5))entao
               escreval("Magreza leve")
            senao
               se((resultado >= 18.5) E (resultado < 25))entao
                  escreval("Saudavel")
               senao
                  se((resultado >= 25) E (resultado < 30))entao
                     escreval("Sobrepeso")
                  senao
                     se((resultado >= 30) E (resultado < 35))entao
                        escreval("Obesidade grau 1")
                     senao
                        se((resultado >= 35) E (resultado < 40))entao
                           escreval("Obesidade grau 2 (severa)")
                        senao
                           se(resultado >= 40)entao
                              escreval("Obesidade grau 3 (morbida)")
                           fimse
                        fimse
                     fimse
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse

Fimalgoritmo
