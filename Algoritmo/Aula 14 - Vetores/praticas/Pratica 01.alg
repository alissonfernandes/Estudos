algoritmo "VerificarSePar"
// Pratica 01
// Ler 7 valores e mostrar quantos sao pares
var
     val: vetor[1..7] de Inteiro
     i, totPar:Inteiro

procedimento numeroPar(v:Inteiro)

inicio
         Se(v%2=0) entao
                   totPar <- totPar + 1
         FimSe
FimProcedimento
     
inicio
      Para i <- 1 ate 7 faca
             Escreval("Digite um valor: ")
             Leia(val[i])
      FimPara
      
      totPar <- 0
      
      Para i <- 1 ate 7 faca
             numeroPar(val[i])
      FimPara
      
      Escreval("Total de numeros pares: ", totPar)
      
fimalgoritmo
