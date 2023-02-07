Algoritmo "Desafio universidade"

Var

   codigo_curso: inteiro
   numero_vagas: inteiro
   numero_homens: inteiro
   numero_mulheres: inteiro
   relacao_vagas: real
   total_homens: real
   total_mulheres: real

funcao relacao_candidato_vaga (homens, mulheres, vagas: inteiro): real
var
   somatoria: inteiro
   resposta: real
inicio
   somatoria <- (homens + mulheres)
   resposta <- (somatoria/vagas)
   retorne resposta
fimfuncao

funcao porcentagem (x, y: inteiro): real
var
   resposta: real
   somatoria: real
inicio
   somatoria <- (x + y)
   resposta <- (x/somatoria)*100
   retorne resposta
fimfuncao

Inicio

   escreval("Digite o codigo do curso: ")
   leia(codigo_curso)
   escreval("Digite o numero de vagas: ")
   leia(numero_vagas)
   escreval("Digite quantos homens: ")
   leia(numero_homens)
   escreval("Digite quantas mulheres: ")
   leia(numero_mulheres)

   relacao_vagas <- relacao_candidato_vaga(numero_homens, numero_mulheres, numero_vagas)
   total_homens <-  porcentagem(numero_homens, numero_mulheres)
   total_mulheres <- porcentagem(numero_mulheres, numero_homens)

   escreval("Codigo do curso: ", codigo_curso)
   escreval("Total candidatos por vaga: ", relacao_vagas:4:2)
   escreval("Quantidade de candidatos: ", total_homens:4:2, "%")
   escreval("Quantidade de candidatas: ", total_mulheres:4:2, "%")

Fimalgoritmo