algoritmo "semnome"
// Exercicio 02
// Jogo da Velha
Procedimento carregarTab()
var
   number:Inteiro
   i, j:Inteiro
inicio
     tab[1, 1] <- "1"
     tab[1, 2] <- "2"
     tab[1, 3] <- "3"
     tab[2, 1] <- "4"
     tab[2, 2] <- "5"
     tab[2, 3] <- "6"
     tab[3, 1] <- "7"
     tab[3, 2] <- "8"
     tab[3, 3] <- "9"
FimProcedimento

Procedimento exibirTab()
var
   i, j:Inteiro
inicio
      Para i <- 1 ate 3 faca
           Para j <- 1 ate 3 faca
                Escreva(tab[i, j]:5)
           FimPara
           Escreval()
      FimPara

FimProcedimento

funcao jogar(v:Inteiro):Caractere
inicio
      Escolha(v)
                       caso 1

                         Se ((tab[1,1] = "X") ou (tab[1,1] = "O"))entao
                              Escreval("Posicao INVALIDA. Escolha outra posicao.")
                              jogador <- jogador
                              retorne "i"
                         senao
                              tab[1,1] <- jogador

                              Se(jogador = "X")entao
                                         jogador <- "O"
                              senao
                                         jogador <- "X"
                              FimSe
                              Retorne "v"
                         FimSe
                    caso 2
                         Se ((tab[1,2] = "X") ou (tab[1,2] = "O"))entao
                              Escreval("Posicao INVALIDA. Escolha outra posicao.")
                              jogador <- jogador
                              retorne "i"
                         senao
                              tab[1,2] <- jogador

                              Se(jogador = "X")entao
                                         jogador <- "O"
                              senao
                                         jogador <- "X"
                              FimSe
                              Retorne "v"
                         FimSe
                    caso 3
                         Se ((tab[1,3] = "X") ou (tab[1,3] = "O"))entao
                              Escreval("Posicao INVALIDA. Escolha outra posicao.")
                              jogador <- jogador
                              retorne "i"
                         senao
                              tab[1,3] <- jogador

                              Se(jogador = "X")entao
                                         jogador <- "O"
                              senao
                                         jogador <- "X"
                              FimSe
                              Retorne "v"
                         FimSe
                    caso 4
                         Se ((tab[2,1] = "X") ou (tab[2,1] = "O"))entao
                              Escreval("Posicao INVALIDA. Escolha outra posicao.")
                              jogador <- jogador
                              retorne "i"
                         senao
                              tab[2,1] <- jogador

                              Se(jogador = "X")entao
                                         jogador <- "O"
                              senao
                                         jogador <- "X"
                              FimSe
                              Retorne "v"
                         FimSe
                    caso 5
                         Se ((tab[2,2] = "X") ou (tab[2,2] = "O"))entao
                              Escreval("Posicao INVALIDA. Escolha outra posicao.")
                              jogador <- jogador
                              retorne "i"
                         senao
                              tab[2,2] <- jogador

                              Se(jogador = "X")entao
                                         jogador <- "O"
                              senao
                                         jogador <- "X"
                              FimSe
                              Retorne "v"
                         FimSe
                    caso 6
                         Se ((tab[2,3] = "X") ou (tab[2,3] = "O"))entao
                              Escreval("Posicao INVALIDA. Escolha outra posicao.")
                              jogador <- jogador
                              retorne "i"
                         senao
                              tab[2,3] <- jogador

                              Se(jogador = "X")entao
                                         jogador <- "O"
                              senao
                                         jogador <- "X"
                              FimSe
                              Retorne "v"
                         FimSe
                    caso 7
                         Se ((tab[3,1] = "X") ou (tab[3,1] = "O"))entao
                              Escreval("Posicao INVALIDA. Escolha outra posicao.")
                              jogador <- jogador
                              retorne "i"
                         senao
                              tab[3,1] <- jogador

                              Se(jogador = "X")entao
                                         jogador <- "O"
                              senao
                                         jogador <- "X"
                              FimSe
                              Retorne "v"
                         FimSe
                    caso 8
                         Se ((tab[3,2] = "X") ou (tab[3,2] = "O"))entao
                              Escreval("Posicao INVALIDA. Escolha outra posicao.")
                              jogador <- jogador
                              retorne "i"
                         senao
                              tab[3,2] <- jogador

                              Se(jogador = "X")entao
                                         jogador <- "O"
                              senao
                                         jogador <- "X"
                              FimSe
                              Retorne "v"
                         FimSe
                    caso 9
                         Se ((tab[3,3] = "X") ou (tab[3,3] = "O"))entao
                              Escreval("Posicao INVALIDA. Escolha outra posicao.")
                              jogador <- jogador
                              retorne "i"
                         senao
                              tab[3,3] <- jogador

                              Se(jogador = "X")entao
                                         jogador <- "O"
                              senao
                                         jogador <- "X"
                              FimSe
                              Retorne "v"
                         FimSe
          FimEscolha

FimFuncao

Funcao primeiraL(letra:Caractere):caractere
var
inicio
      Se ((tab[1,1] = letra) e (tab[1,2] = letra) e (tab[1,3] = letra))entao
           Retorne "G"
      senao
           Retorne ""
      FimSe

FimFuncao

Funcao segundaL(letra:Caractere):caractere
var
inicio
      Se ((tab[2,1] = letra) e (tab[2,2] = letra) e (tab[2,3] = letra))entao
           Retorne "G"
      senao
           Retorne ""
      FimSe

FimFuncao

Funcao terceiraL(letra:Caractere):caractere
var
inicio
      Se ((tab[3,1] = letra) e (tab[3,2] = letra) e (tab[3,3] = letra))entao
           Retorne "G"
      senao
           Retorne ""
      FimSe

FimFuncao

Funcao primeiraC(letra:Caractere):caractere
var
inicio
      Se ((tab[1,1] = letra) e (tab[2,1] = letra) e (tab[3,1] = letra))entao
           Retorne "G"
      senao
           Retorne ""
      FimSe

FimFuncao

Funcao segundaC(letra:Caractere):caractere
var
inicio
      Se ((tab[1,2] = letra) e (tab[2,2] = letra) e (tab[3,2] = letra))entao
           Retorne "G"
      senao
           Retorne ""
      FimSe

FimFuncao

Funcao terceiraC(letra:Caractere):caractere
var
inicio
      Se ((tab[1,3] = letra) e (tab[2,3] = letra) e (tab[3,3] = letra))entao
           Retorne "G"
      senao
           Retorne ""
      FimSe

FimFuncao


Funcao verificaGanhador():Caracter
var
   gamer:Caractere
   nub, i, j:Inteiro
inicio
      Se(primeiraL() = "G")entao
           Retorne "G"
      senao
            Se(segundaL() = "G")entao
                        Retorne "G"
            senao
                 Se(terceiraL() = "G") entao
                              Retorne "G"
                 senao
                       Se(primeiraC() = "G") entao
                            Retorne "G"
                       senao
                           Se(segundaC() = "G") entao
                                 Retorne "G"
                            senao
                                Se(terceiraC() = "G") entao
                                             Retorne "G"
                                senao
                                      retorne ""
                                FimSe
                            FimSe
                       FimSe
                 FimSe
            FimSe
      FimSe
      


FimFuncao


var
   tab:vetor[1..3, 1..3] de Caractere
   continue:Caractere
   jogador:Caractere
   posicao: Inteiro
   jogada:Caractere
inicio
      continue <- "SIM"
      jogador <- "X"
      jogada <- "v"
      carregarTab()
      
      Repita
            Se(jogada = "valida")entao
                      LimpaTela
            FimSe
            LimpaTela
          exibirTab()
          Escreval("Vai jogar [", jogador, "] em qual posicao?")
           Leia(posicao)
          Repita
                jogada <- jogar(posicao)
                Se(jogada = "i")entao
                     Escreva("Posicao: ")
                     Leia(posicao)
                FimSe
                


          Ate(jogada = "v")
          
          Se(verificaGanhador() = "G")entao
                Escreval("Fim Partida")
                continue <- "NAO"
          senao
               continue <- "SIM"
          FimSe
          
      Ate(continue = "NAO")




fimalgoritmo
