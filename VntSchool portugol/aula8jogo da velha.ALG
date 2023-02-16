Algoritmo "jogo da velha"

Var
   //Variaveis globais
   jogo: vetor[1..3,1..3] de caractere
   i,j: inteiro
   x, a: caractere
   linha, coluna, opcao: inteiro
   contador: inteiro
   vencedor: logico
   vez: inteiro
   jogador: inteiro
   //-------------------------------------------------
   //Procedimento padrao para preenchimento da matriz
procedimento matriz_valores()
inicio
   para i de 1 ate 3 faca
      para j de 1 ate 3 faca
         contador <- contador+1
         jogo[i,j] <- NumpCarac(contador)
      fimpara
   fimpara
fimprocedimento
//-------------------------------------------------
//Procedimento padrao para desenhar a matriz
procedimento board()
inicio
   para i de 1 ate 3 faca
      para j de 1 ate 3 faca
         escreva(" |", jogo[i,j])
      fimpara
      escreval()
   fimpara
fimprocedimento
//--------------------------------------------------
//Procedimento para jogar
procedimento jogar()
inicio
   x <- "X"
   vencedor <- falso
   vez <- 0
   jogador <- 1
   repita
      escreval("Jogador [",x, "] Escolha um numero: ")
      leia(opcao)
      se((opcao > 0) E (opcao < 10))entao
         se((opcao > 0) E (opcao < 4))entao
            linha <- 1
            coluna <- opcao
            se((jogo[linha,coluna] = "X") OU (jogo[linha,coluna] = "O"))entao
               escreval("Este campo ja esta preenchido!")
               leia(a)
               escreval("Aperte Enter para continuar: ")
            senao
               jogo[linha,coluna] <- x
               vencedor <- checarVitoria()
               vez <- vez + 1
               se(vencedor = falso)entao
                  se(jogador % 2 <> 0)entao
                     x <- "O"
                  senao
                     x <- "X"
                  fimse
                  jogador <- jogador + 1
               fimse
            fimse
         senao
            se((opcao >3) E (opcao <7))entao
               linha <- 2
               coluna <- opcao - 3
               se((jogo[linha,coluna] = "X") OU (jogo[linha,coluna] = "O"))entao
                  escreval("Este campo ja esta preenchido!")
                  leia(a)
                  escreval("Aperte Enter para continuar: ")
               senao
                  jogo[linha,coluna] <- x
                  vencedor <- checarVitoria()
                  vez <- vez + 1
                  se(vencedor = falso)entao
                     se(jogador % 2 <> 0)entao
                        x <- "O"
                     senao
                        x <- "X"
                     fimse
                     jogador <- jogador + 1
                  fimse
               fimse
            senao
               linha <- 3
               coluna <- opcao - 6
               se((jogo[linha,coluna] = "X") OU (jogo[linha,coluna] = "O"))entao
                  escreval("Este campo ja esta preenchido!")
                  leia(a)
                  escreval("Aperte Enter para continuar: ")
               senao
                  jogo[linha,coluna] <- x
                  vencedor <- checarVitoria()
                  vez <- vez + 1
                  se(vencedor = falso)entao
                     se(jogador % 2 <> 0)entao
                        x <- "O"
                     senao
                        x <- "X"
                     fimse
                     jogador <- jogador + 1
                  fimse
               fimse
            fimse
         fimse
      senao
         escreval("Opcao invalida!")
         leia(a)
         escreval("Aperte Enter para continuar: ")
      fimse
      limpatela
      board()
   ate(vencedor = verdadeiro) OU (vez = 9)
   se(vencedor = verdadeiro)entao
      escreval("Jogador ", x , " Venceu!")
   senao
      escreval("Deu velha!!")
   fimse
fimprocedimento
//--------------------------------------------------
//funcao checar vitoria
funcao checarVitoria(): logico

var
   resposta: logico
inicio
   resposta <- falso

   para i de 1 ate 3 faca
      se((jogo[i,1] = jogo[i,2]) E (jogo[i,2] = jogo[i,3]))entao
         resposta <- verdadeiro
      fimse
   fimpara

   para i de 1 ate 3 faca
      se((jogo[1,i] = jogo[2,i]) E (jogo[2,i] = jogo[3,i]))entao
         resposta <- verdadeiro
      fimse
   fimpara

   para i de 1 ate 3 faca
      se((jogo[1,1] = jogo[2,2]) E (jogo[2,2] = jogo[3,3]))entao
         resposta <- verdadeiro
      fimse
   fimpara

   para i de 1 ate 3 faca
      se((jogo[1,3] = jogo[2,2]) E (jogo[2,2] = jogo[3,1]))entao
         resposta <- verdadeiro
      fimse
   fimpara

   retorne resposta
fimfuncao

//--------------------------------------------------
//Main
Inicio
   contador <-0
   matriz_valores()
   board()
   jogar()

Fimalgoritmo
