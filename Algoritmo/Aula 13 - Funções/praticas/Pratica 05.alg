algoritmo "AnalisadorStrings"
// Pratica 05
// Analisador de Strings
var
   n:Caractere
   i:Inteiro
inicio
      Escreval("Digite o seu nome: ")
      Leia(n)
      
      //compr
      Escreval("Numero de letras: ", compr(n))
      
      //Maiusc
      Escreval("Nome em Maiusculo: ", maiusc(n))
      
      //Minusc
      Escreval("Nome em Minusculo: ", minusc(n))
      
      //Copia
      Escreval("Primeira letra do nome: ", copia(n, 1, 1))
      Escreval("Ultima letra do nome: ", copia(n, compr(n), compr(n)))
      
      //Pos
      Escreval("Posicao da ltima letra do nome: ", pos(copia(n, compr(n), compr(n)), n))
      
      //Asc
      Escreval("Codigo da primeira letra: ", Asc("A"))
      
      //Carac
      Escreval("A letra de codigo 65 e :", carac(65))
      
      Para i <- compr(n) ate 1 passo -1  faca
              Escreva(copia(n, i, 1))
      FimPara

fimalgoritmo
