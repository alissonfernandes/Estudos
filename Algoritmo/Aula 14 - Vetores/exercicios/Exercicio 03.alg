algoritmo "semnome"
// Exercicio 04
// Reservar espaco no cinema

procedimento exibir()
var
   j:Inteiro
inicio
             LimpaTela
             Para j <- 1 ate 10 faca
                  Se (cadeira[j] = "0") entao
                       Escreva(" [B", j, "] ")
                  senao
                       Escreva(" [", cadeira[j], "] ")
                  FimSe
             FimPara
             Escreval("")
              Escreval("-------------------------------------------------------------------------")
FimProcedimento

var
    cadeira:vetor[1..10] de Caractere
    i:Inteiro
    reserva:Inteiro
    resp:Caractere
    
    
inicio
      Para i <- 1 ate 10 faca
           cadeira[i] <- "0"
         FimPara

         Repita
               exibir()
         Escreva("Reservar cadeira: ")
         Leia(reserva)
         Se(cadeira[reserva] = "0")entao
              cadeira[reserva] <- "---"
              Escreval("Cadeira B", reserva, " RESERVADA!")
         senao
              Escreval("ATENCAO: Esta cadeira ja esta reservada.")
              
         FimSe

         Escreva("Deseja Reservar um cadeira [S/N]")
         Leia(resp)
      
      Ate(resp = "N")
      



fimalgoritmo
