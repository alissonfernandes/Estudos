algoritmo "ParOuImpar"
//Pratica 02
// Verificar se o numero e par/Impar
var
  n:Inteiro
  
  Funcao verificar(v:Inteiro):Caractere
  Inicio
        Se(v%2=0) entao
             Retorne "Par"
        senao
             Retorne "Impar"
        FimSe

  FimFuncao
inicio
      Escreval("Digite um numero: ")
      Leia(n)
      
      Escreval("O numero ", n, " e um valor ", verificar(n))

fimalgoritmo
