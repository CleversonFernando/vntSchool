Algoritmo "desafio supermercado"

Var

   categoria: inteiro
   refrigeracao: caractere
   nome: caractere
   preco_inicial: real
   preco_aumento: real
   preco_desconto: real
   classificacao_aumento: caractere
   classificacao_desconto: caractere

Inicio

   escreval("Entre com o nome do produto: ")
   leia(nome)
   escreval("Entre com o preco:")
   leia(preco_inicial)

   escreval("Selecione a categoria: ")
   escreval("[1]-Limpeza")
   escreval("[2]-Alimentacao")
   escreval("[3]-Vestuario")
   leia(categoria)

   escreval("Situacao do produto - Necessita refrigeracao?")
   escreval("[S]-Sim")
   escreval("[N]-Nao")
   leia(refrigeracao)

   se(preco_inicial <= 25)entao
      escolha (categoria)
      caso 1
         preco_aumento <-  preco_inicial + preco_inicial * (5/100)
      caso 2
         preco_aumento <-  preco_inicial + preco_inicial * (8/100)
      caso 3
         preco_aumento <-  preco_inicial + preco_inicial * (10/100)
      fimescolha
   senao
      escolha (categoria)
      caso 1
         preco_aumento <-  preco_inicial + preco_inicial * (12/100)
      caso 2
         preco_aumento <-  preco_inicial + preco_inicial * (15/100)
      caso 3
         preco_aumento <-  preco_inicial + preco_inicial * (18/100)
      fimescolha
   fimse
   se((categoria = 2) OU (refrigeracao = "s"))entao
      preco_desconto <- preco_inicial - (preco_inicial * (5/100))
   senao
      preco_desconto <- preco_inicial - (preco_inicial * (8/100))
   fimse

   se(preco_aumento <= 50)entao
      classificacao_aumento <- "Barato!"
   senao
      se(preco_aumento >= 120)entao
         classificacao_aumento <- "Caro"
      senao
         classificacao_aumento <- "Normal"
      fimse
   fimse
   se(preco_desconto <= 50)entao
      classificacao_desconto <- "Barato!"
   senao
      se(preco_desconto >= 120)entao
         classificacao_desconto <- "Caro"
      senao
         classificacao_desconto <- "Normal"
      fimse
   fimse

   escreval("Produto: ", nome, ": Preco inicial:", preco_inicial)
   escreval("Preco com aumento: ", preco_aumento, " - ", classificacao_aumento)
   escreval("Preco com desconto: ", preco_desconto, " - ", classificacao_desconto)

Fimalgoritmo