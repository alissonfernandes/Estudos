algoritmo "semnome"

var
   tabuleiro: vetor[1..3, 1..3] de Caractere
   posicao, jogada, jogador, ganhador: Caractere
   conte:Inteiro

   

//Inicia tabuleiro com os numeros
procedimento iniciarTabuleiro()
inicio
       tabuleiro[1,1] <- "1"
       tabuleiro[1,2] <- "2"
       tabuleiro[1,3] <- "3"
       tabuleiro[2,1] <- "4"
       tabuleiro[2,2] <- "5"
       tabuleiro[2,3] <- "6"
       tabuleiro[3,1] <- "7"
       tabuleiro[3,2] <- "8"
       tabuleiro[3,3] <- "9"
FimProcedimento

//Exibe o tabuleiro
Procedimento exibirTabuleiro
var
   i,j:Inteiro
inicio
      Para i <- 1 ate 3 faca
           Para j <- 1 ate 3 faca
                Escreva(tabuleiro[i,j]:5)
           FimPara
           Escreval()
      FimPara

FimProcedimento

//Realiza uma jogada
Funcao jogar(letra, posicao:Caractere):Caractere
var
   validaJogada:Caractere
inicio
      validaJogada <- "invalido"
      
       Se ((posicao = "1") e (tabuleiro[1,1] = "1"))entao
          tabuleiro[1,1] <- letra
          validaJogada <- "valido"
       FimSe
       
       Se ((posicao = "2") e (tabuleiro[1,2] = "2"))entao
          tabuleiro[1,2] <- letra
          validaJogada <- "valido"
       FimSe
       
       Se ((posicao = "3") e (tabuleiro[1,3] = "3"))entao
          tabuleiro[1,3] <- letra
          validaJogada <- "valido"
       FimSe
       
       Se ((posicao = "4") e (tabuleiro[2,1] = "4"))entao
          tabuleiro[2,1] <- letra
          validaJogada <- "valido"
       FimSe
       
       Se ((posicao = "5") e (tabuleiro[2,2] = "5"))entao
          tabuleiro[2,2] <- letra
          validaJogada <- "valido"
       FimSe
       
       Se ((posicao = "6") e (tabuleiro[2,3] = "6"))entao
          tabuleiro[2,3] <- letra
          validaJogada <- "valido"
       FimSe
       
       Se ((posicao = "7") e (tabuleiro[3,1] = "7"))entao
          tabuleiro[3,1] <- letra
          validaJogada <- "valido"
       FimSe
       
       Se ((posicao = "8") e (tabuleiro[3,2] = "8"))entao
          tabuleiro[3,2] <- letra
          validaJogada <- "valido"
       FimSe
       
       Se ((posicao = "9") e (tabuleiro[3,3] = "9"))entao
          tabuleiro[3,3] <- letra
          validaJogada <- "valido"
       FimSe
       
       Retorne validaJogada
FimFuncao

// Verifica se tem Ganhador
procedimento verificaGanhador(jog:Caractere)
var
   letraXO:Caractere
   i:Inteiro
inicio
      letraXO <- "X"
      Para i <- 1 ate 2 faca
             Se((tabuleiro[1,1] = letraXO) e (tabuleiro[1,2] = letraXO) e (tabuleiro[1,3] = letraXO))entao
                  ganhador <- letraXO
             FimSe
             Se((tabuleiro[2,1] = letraXO) e (tabuleiro[2,2] = letraXO) e (tabuleiro[2,3] = letraXO))entao
                  ganhador <- letraXO
             FimSe
             Se((tabuleiro[3,1] = letraXO) e (tabuleiro[3,2] = letraXO) e (tabuleiro[3,3] = letraXO))entao
                  ganhador <- letraXO
             FimSe
             Se((tabuleiro[1,1] = letraXO) e (tabuleiro[2,1] = letraXO) e (tabuleiro[3,1] = letraXO))entao
                  ganhador <- letraXO
             FimSe
              Se((tabuleiro[1,2] = letraXO) e (tabuleiro[2,2] = letraXO) e (tabuleiro[3,2] = letraXO))entao
                  ganhador <- letraXO
             FimSe
              Se((tabuleiro[1,3] = letraXO) e (tabuleiro[2,3] = letraXO) e (tabuleiro[3,3] = letraXO))entao
                  ganhador <- letraXO
             FimSe
             
              Se((tabuleiro[1,1] = letraXO) e (tabuleiro[2,2] = letraXO) e (tabuleiro[3,3] = letraXO))entao
                  ganhador <- letraXO
             FimSe
              Se((tabuleiro[3,1] = letraXO) e (tabuleiro[2,2] = letraXO) e (tabuleiro[1,3] = letraXO))entao
                  ganhador <- letraXO
             FimSe
             
             
             letraXO <- "O"
      FimPara


FimProcedimento

inicio
       iniciarTabuleiro()
       jogador <- "X"
       ganhador <- "Sem Ganhador"
       conte <- 1
       
      Repita
         exibirTabuleiro()
         Repita //repetir ate que a jagada seja valida
               Escreval("Escolha uma Posicao para [", jogador,"]: ")
               Leia(posicao)
               
               jogada <- jogar(jogador, posicao)
               
               Se(jogada = "invalido")entao//Caso a Jogada seja Invalido
                    Escreva("Jogada INVALIDA. ")
               senao//caso a jogada seja valido
                    verificaGanhador(jogador)
                    Se (jogador = "X")entao
                       jogador <- "O"
                    senao
                       jogador <- "X"
                    FimSe
                    LimpaTela
               FimSe

         Ate(jogada = "valido")
         
         Se (conte >= 9)entao
              ganhador <- "EMPATE"
         senao
              conte <- conte + 1
         FimSe
      Ate(ganhador <> "Sem Ganhador")
      
      exibirTabuleiro()

      Se(ganhador = "EMPATE") entao
            Escreval("FIM DA PARTIDA. ", ganhador, "!")
      senao
           Escreval("FIM DA PARTIDA. O [", ganhador, "] ganhou!")
      FimSe

fimalgoritmo
