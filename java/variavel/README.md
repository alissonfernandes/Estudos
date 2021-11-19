# Variáveis em Java
## Regras e convenções de criação
* Não devem começar com número;
* Embora permitido, "$" e "_" devem ser evitados;
* São case-sensitive;
* Sem espaços;
* Não pode ser as palavras reservadas do Java

## Boas práticas de nomeação de variável
 * Sempre começar com letra minúscula;
 * Nomes expressivos;
 * Notação camelo;
 * Quando constante(final) maiúscula e separada por "_";

## Tipos de dados
 Conceituação: São os valores e consequentemente operações que as variáveis podem assumir e sofrer, respectivamente.
### Tipificação:
* Estática(forte) Vs Dinâmica(fraco)
* Primitivo Vc Composto

| Família | Tipo Primitivo | Classe Invólucro | Tamanho | Exemplo
|--- |--- |--- |--- |--- |
| Lógico | boolean | Boolean | 1 bit | true |
| Literal | char | Character | 1 byte | 'A'|
| Literal (Objeto) | - | String | 1byte/cada | "Java" |
| Inteiro | byte | Byte | 1 byte | 127 |
| Inteiro | short | Short | 2 bytes | 32767 |
| Interio | int | Integer | 4 bytes | 2147483 |
| Inteiro | long | Long | 8 bytes | 2^63 |
| Real | float | Float | 4 bytes | 3.4e^+38 |
| Real | double | Double | 8 bytes | 1.8e^308 |

## Valores default de variáveis
 | Tipo de dado | Valor default |
 |--- |---|
 |byte|0|
 |short|0|
 |int|0|
 |long|0L|
 |float|0.0f|
 |double|0.0d|
 |char|"\u0000"|
 |String (e Objetos)|null|
 |boolean|false|

