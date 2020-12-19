algoritmo "semnome"
// Pratica 03
// So importa quem comeca com "c"

var
nome:Caractere
soC: vetor[1..10] de Caractere
c, tot:Inteiro
inicio
      Para c <- 1  ate 10 faca
      Escreva("Digite seu nome: ")
      Leia(nome)
         Se(copia(maiusc(nome), 1, 1) = "C") entao
              tot <- tot + 1
              soC[tot] <- nome
         FimSe
      FimPara
      
      LimpaTela
      Escreval("Listagem Final")
      Para c <- 1 ate 10 faca
             Escreval(soC[c])
      FimPara
fimalgoritmo
