Algoritmo "funcoes de string"

Var

   resposta_a, resposta_c, resposta_d, resposta_i: inteiro
   resposta_b, resposta_ee, resposta_f, resposta_g, resposta_h: caractere
   a, c, d, ee, f, g, i: caractere
   b,  h, ini, fim: inteiro
   
Inicio

   Asc(a: caractere)
   Carac(b: inteiro)
   Caracpnum(c: caractere)
   Compr(d: caractere)
   Copia(ee: caractere; ini, fim: inteiro)
   Maiusc(f: caractere)
   Minusc(g: caractere)
   Numpcarac(h: inteiro ou real)
   Pos(seg, i : caractere)

   a <- "Fernando"
   b <- 70
   c <- "1"
   d <- "Fernando"
   ee <- "Fernando"
   f <- "Fernando"
   g <- "FERNANDO"
   h <- 120
   i <- "Fernando"

   resposta_a <- Asc(a)
   resposta_b <- Carac(b)
   resposta_c <- Caracpnum(c)
   resposta_d <-  Compr(d)
   resposta_ee<- Copia(ee;2,4)
   resposta_f <-  Maiusc(f)
   resposta_g <-  Minusc(g)
   resposta_h <-  Numpcarac(h)
   resposta_i <-  Pos("nan", i)

   escreval("Funcao Asc: ", resposta_a)
   escreval("Funcao Carac: ", resposta_b)
   escreval("Funcao  Caracpnum: ", resposta_c)
   escreval("Funcao  Compr: ", resposta_d)
   escreval("Funcao  Copia: ", resposta_ee)
   escreval("Funcao  Maiusc: ", resposta_f)
   escreval("Funcao  Minusc: ", resposta_g)
   escreval("Funcao  Numpcarac: ", resposta_h)
   escreval("Funcao  Pos: ", resposta_i)

Fimalgoritmo