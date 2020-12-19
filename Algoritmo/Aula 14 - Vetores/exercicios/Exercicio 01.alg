algoritmo "semnome"
// Exercicio 01
//Torneio de futebol

funcao sequencia(v:Inteiro):Caractere
var

inicio
      Escolha(v)
                caso 1
                     Retorne "primeiro"
                caso 2
                     Retorne "segundo"
                caso 3
                      Retorne "terceiro"
      FimEscolha
FimFuncao

var
     time:vetor[1..3] de Caractere
     i, j:Inteiro
inicio
      Para i <- 1 ate 3 faca
             Escreva("Nome do ", sequencia(i), " time: ")
             Leia(time[i])
      FimPara
      
      LimpaTela
      
      Escreval("-------------------")
      Escreval("TABELA DE PARTIDAS")
      Escreval("-------------------")
      
      Para i <- 1 ate 3 faca
             Para j <- 1 ate 3 faca
                    Se (time[i] <> time[j])entao
                           Escreval(time[i]:15, "[] X [] ", time[j])
                    FimSe
             FimPara
      FimPara
fimalgoritmo
