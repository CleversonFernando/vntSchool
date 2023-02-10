Algoritmo "Supermercado"

Var

   produto: vetor[1..5] de caractere
   preco_lucro: vetor[1..5,1..3] de real
   total_lucro, soma_compra, soma_venda: real
   a, b: inteiro
   soma: real

funcao lucro(compra,venda: real): real

var
   resposta: real
inicio
   resposta <- ((venda - compra)/compra)* 100
   retorne resposta
fimfuncao

Inicio
   a <-1
   b <-1
   enquanto (a <= 5) faca
      escreval("Digite o nome do produto: ", a)
      leia(produto[a])
      escreval("Digite o preco de compra: ", a)
      leia(preco_lucro[a,b])
      escreval("Digite o preco de venda: ", a)
      leia(preco_lucro[a,b+1])

      se((preco_lucro[a,b] <= 0) OU (preco_lucro[a,b+1] <= 0))entao
         escreval("Valores nao devem ser negativos ou menor que zero!")
         a <- a - 1
      fimse
      a <- a + 1
   fimenquanto

   LimpaTela
   para a de 1 ate 5 faca
      preco_lucro[a,b+2] <- lucro(preco_lucro[a,b],preco_lucro[a,b+1])
   fimpara
   para a de 1 ate 5 faca
      se(preco_lucro[a,b+2] < 10)entao
         escreval("O produto ",produto[a], " Teve lucro de ", preco_lucro[a,b+2]:4:2, "%, menor que 10%")
      senao
         se(preco_lucro[a,b+2] > 20)entao
            escreval("O produto ",produto[a], " Teve lucro de ", preco_lucro[a,b+2]:4:2, "%, maior que 20%")
         senao
            escreval("O produto ",produto[a], " Teve lucro de ", preco_lucro[a,b+2]:4:2, "%, entre 10% e 20%")
         fimse
      fimse
   fimpara

   para a de 1 ate 5 faca
      soma_compra <- soma_compra + preco_lucro[a,b]
      soma_venda <- soma_venda + preco_lucro[a,b+1]
   fimpara
   total_lucro <- (soma_venda - soma_compra)
   escreval("Total de compras: ", soma_compra:4:2)
   escreval("Total de vendas: ", soma_venda:4:2)
   escreval("Lucro total: ", total_lucro:4:2)

Fimalgoritmo