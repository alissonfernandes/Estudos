algoritmo "semnome"
// Pratica 04
// Preencher uma matriz de 4a ordem
var
  m: vetor[1..4, 1..4]  de Inteiro
  l, c, sDP, p2l, mai3c:Inteiro
inicio
      sDP <- 0 //Soma da Diagonal Principal
      p2l <- 1 // Produto da Segunda Linha
      Para l <- 1 ate 4 faca
           Para c <- 1 ate 4 faca
                  Escreva("Digite o valor da posicao [", l, ",", c,"]: ")
                  Leia(m[l,c])
                  
                  Se (l = c)entao
                     sDP <- sDP + m[l,c]
                  FimSe
           FimPara
      FimPara
      
      Para l <- 1 ate 4 faca
           Para c <- 1 ate 4 faca
                  Escreva(m[l,c]:5)
           FimPara
           Escreval()
      FimPara
      
      Para c <- 1 ate 4 faca
             p2l <- p2l * m[2,c]
      FimPara
      
      Para l <- 1 ate 4 faca
             Se (m[l, 3] > mai3c)entao
                  mai3c <- m[l,3]
             FimSe
      FimPara
      Escreval("A soma dos valores da Diagonal Principal e ", sDP)
      Escreval("O produto dos valores da segunda linha e ", p2l)
      Escreval(" O maior da terceira coluna e ", mai3c)
fimalgoritmo
