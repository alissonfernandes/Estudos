algoritmo "semnome"
// Pratica 03
// Criar uma matriz de 3a ordem
var
  mID: vetor[1..3, 1..3] de Inteiro
  i, j:Inteiro
inicio
      Para i <- 1 ate 3 faca
             Para j <- 1 ate 3 faca
                  Se (i = j)entao
                        mID[i,j] <- 1
                  senao
                       mID[i,j] <- 0
                  FimSe
             FimPara
      FimPara
      
      Para i <- 1 ate 3 faca
             Para j <- 1 ate 3 faca
                    Escreva(mID[i,j]:3)
             FimPara
             Escreval()
      FimPara

fimalgoritmo
