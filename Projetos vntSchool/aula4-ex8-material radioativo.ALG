Algoritmo "Material radioativo"

Var

   tempo_total: real
   tempo_horas: real
   tempo_minutos: real
   massa_inicial: real
   limite: real
   decaimento_massa: real

inicio

   limite <- 0.5

   escreval("Digite a massa em gramas: ")
   leia(massa_inicial)

   decaimento_massa <- massa_inicial

   enquanto (decaimento_massa > limite) faca
      decaimento_massa <- (decaimento_massa/2)
      tempo_total <- tempo_total + 50
   fimenquanto

   tempo_horas <- int (tempo_total / 3600)
   tempo_minutos <- int (tempo_total - (tempo_horas * 3600)) /60

   escreval("Massa inicial: ", massa_inicial, "g")
   escreval("Massa final: ", decaimento_massa:4:2, "g")
   escreval("Tempo estimado: ", tempo_horas:4:2, " horas")
   escreval("Tempo estimado: ", tempo_minutos:4, " minutos")

Fimalgoritmo