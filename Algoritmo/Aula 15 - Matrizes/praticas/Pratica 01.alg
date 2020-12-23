algoritmo "lerMatriz"
// Pratica 01
// Preencher uma matriz 3x2 com valores via teclado
var
    mat: vetor[1..3, 1..2] de Inteiro
    l, c:Inteiro
inicio
      Para l <- 1 ate 3 faca
           Para c <- 1 ate 2 faca
                Escreva("Digite um valor da posicao [", l, ", ", c,"]: ")
                Leia(mat[l,c])
           FimPara
      FimPara
      
      Para l <- 1 ate 3 faca
           Para c <- 1 ate 2 faca
                Escreva(mat[l,c])
           FimPara
           Escreval()
      FimPara

fimalgoritmo
