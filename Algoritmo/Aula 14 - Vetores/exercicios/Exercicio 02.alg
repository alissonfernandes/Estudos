algoritmo "semnome"
// Exercicio 02
// Corrigindo provas


var
    gabarito:vetor[1..5] de Caractere
    aluno:vetor[1..3] de Caractere
    resposta:Caractere
    nota:vetor[1..3] de Real
    i, j:Inteiro
    nome:Caractere
inicio
      Escreval("Passo 1 - Cadastro de Gabarito")
      Escreval("-------------------------------")
      
      Para i <- 1 ate 5 faca
             Escreval("Questao ", i, ": ")
             Leia(gabarito[i])
      FimPara
      
      LimpaTela
      
      Para i <- 1 ate 3 faca
             Escreval("-------------")
              Escreval("Aluno ", i)
              Escreval("-------------")
              
              Escreva("Nome: ")
              Leia(aluno[i])
              
              Escreval("Respostas do aluno")

              Para j <- 1 ate 5 faca
                     Escreva("Questao ", j, ": ")
                     Leia(resposta)
                     
                     Se(resposta = gabarito[j])entao
                          nota[i] <- nota[i] + 2
                     FimSe
              FimPara
      FimPara

      LimpaTela

      Escreval("------------------------")
      Escreval("NOTAS FINAIS")
      Escreval("------------------------")
      
      Para i <- 1 ate 3 faca
             Escreval(aluno[i]:15, nota[i])
      FimPara
      
      Escreval("---------------------------")
      Escreval("Media da Turma: ", (nota[1] + nota[2] + nota[3])/3)
      

      
fimalgoritmo
