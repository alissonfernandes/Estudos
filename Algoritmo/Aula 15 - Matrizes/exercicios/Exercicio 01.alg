algoritmo "semnome"
// Exercicio 01
// Dissecando matrizes
procedimento mostraMatriz()
var
   row, column:Inteiro
inicio
      Para row <- 1 ate 4 faca
           Para column <- 1 ate 4 faca
                  Escreva(matriz[row, column]:5)
           FimPara
           Escreval()
      FimPara
FimProcedimento


procedimento mostraDiagonalP()
var
   row, column:Inteiro
inicio
      Para row <- 1 ate 4 faca
           Para column <- 1 ate 4 faca
                Se (column = row)entao
                  Escreva(matriz[row, column]:5)
                senao
                    Escreva(" ":5)
                FimSe
           FimPara
           Escreval()
      FimPara
FimProcedimento

procedimento mostraTriSup()
var
   row, column:Inteiro
inicio
      Para row <- 1 ate 4 faca
           Para column <- 1 ate 4 faca
                Escolha(row)
                            Caso 1
                                   Escolha(column)
                                                  caso 2
                                                       Escreva(matriz[row, column]:5)
                                                  caso 3
                                                       Escreva(matriz[row, column]:5)
                                                  caso 4
                                                       Escreva(matriz[row, column]:5)
                                                  OutroCaso
                                                           Escreva("":5)
                                   FimEscolha
                            caso 2
                                 Escolha(column)
                                                  caso 3
                                                       Escreva(matriz[row, column]:5)
                                                  caso 4
                                                       Escreva(matriz[row, column]:5)
                                                  OutroCaso
                                                       Escreva("":5)
                                   FimEscolha
                            caso 3
                                 Escolha(column)
                                                  caso 4
                                                       Escreva(matriz[row, column]:5)
                                                  OutroCaso
                                                       Escreva("":5)
                                   FimEscolha
                            OutroCaso
                                     Escreva("":5)

                FimEscolha
           FimPara
           Escreval()
      FimPara
FimProcedimento

procedimento mostraTriInf()
var
   row, column:Inteiro
inicio
      Para row <- 1 ate 4 faca
           Para column <- 1 ate 4 faca
                Escolha(column)
                            Caso 1
                                   Escolha(row)
                                                  caso 2
                                                       Escreva(matriz[row, column]:5)
                                                  caso 3
                                                       Escreva(matriz[row, column]:5)
                                                  caso 4
                                                       Escreva(matriz[row, column]:5)
                                                  OutroCaso
                                                           Escreva("":5)
                                   FimEscolha
                            caso 2
                                 Escolha(row)
                                                  caso 3
                                                       Escreva(matriz[row, column]:5)
                                                  caso 4
                                                       Escreva(matriz[row, column]:5)
                                                  OutroCaso
                                                       Escreva("":5)
                                   FimEscolha
                            caso 3
                                 Escolha(row)
                                                  caso 4
                                                       Escreva(matriz[row, column]:5)
                                                  OutroCaso
                                                       Escreva("":5)
                                   FimEscolha
                            OutroCaso
                                     Escreva("":5)

                FimEscolha
           FimPara
           Escreval()
      FimPara
FimProcedimento


var
   matriz:vetor[1..4, 1..4] de Inteiro
   i, j, res:Inteiro
inicio

      Para i <- 1 ate 4 faca
           Para j <- 1 ate 4 faca
                  Escreva("Digite um valor na posicao [", i, ",", j, "]: ")
                  Leia(matriz[i,j])
           FimPara
           Escreval()
      FimPara
      

      
      res <- 0
      
      Repita
            LimpaTela
            Escolha(res)
                        caso 1
                             mostraMatriz()
                        caso 2
                             mostraDiagonalP()
                        caso 3
                             mostraTriSup()
                        caso 4
                              mostraTriInf()
            FimEscolha
            
             Escreval("MENU DE OPCOES")
             Escreval("=====================")
             Escreval("[1] Motrar a Matriz")
             Escreval("[2] Diagonal Principal")
             Escreval("[3] Triangulo Superior")
             Escreval("[4] Triangulo Inferior")
             Escreval("[5] Sair")
             Escreval("OPCAO: ")
             Leia(res)
             
      Ate(res = 5)
      

fimalgoritmo
