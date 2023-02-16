Algoritmo "Calcular idade"

Var
   ano_atual, ano_nascimento, idade: inteiro


Inicio

   escreval("Digite ano atual: ")
   leia(ano_atual)
   escreval("Digite ano de nascimento: ")
   leia(ano_nascimento)

   se((ano_atual < ano_nascimento) OU (ano_nascimento < 0) OU (ano_atual <= 0))entao
      escreval("Valores digitados estao incorretos")
   senao
      idade <- ano_atual - ano_nascimento

      escreval("Idade: ", idade, " anos")
   fimse

Fimalgoritmo