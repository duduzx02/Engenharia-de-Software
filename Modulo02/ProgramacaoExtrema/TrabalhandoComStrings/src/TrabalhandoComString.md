# Trabalhando com String no Java
## A classe String

- A classe String representa uma sequência de caracteres. 
- Recursos:
- - Comparação de cadeias;
- - Busca por subsequências.
- - Concatenação
- - Alteração de maiúculas/minúsculas

## Características principais da classe String:
- **Imutabilidade**
- **Eficiência em aplicações multithred**
- **Construtores e métodos**: 11 construtores e 40 métodoso utilitários para manipulação de Strings.

## Criando objetos String

1. Usando o operador _new_:
2. Usando literais


## Comparação de referências de String
- A diferença entre strings criadas com _new_ e literais pode ser vista ao comparar objetos usando o operador _==_:


## Pool de Strings
- String Constant Pool é usado para economizar memória. String literais iguais compartilham a mesma referência, ao 
  contrário das criadas com _new_.

## Comparação de valores de String
- O método _equals()_ compara os valores dos objetos, quanto o _==_ compara as referências na memória.


## Métodos importantes da classe String
1 - charAt(int index): Retorna o caractere no índice
2 - concat(String s): Concatena strings
3 - equalsIgnoreCase(String s): Compara strings ignorando se é minúsculas ou maiúsculas.
4 - length(): Retorna o comprimento da string
5 - replace(char old, char new): Substitui caracteres.
6 - substring(int begin, int end): Retorna parte da string.
7 - toLowerCase() / toUpperCase(): Converte para minpusculas/maiúsculas.
8 - trim(): Remove espaçosem branco das extremidades.
9 - contains(String s): Verifica se a String contém outra.

## Classes StringBuffer e StringBuilder
- StringBuilder tende a ser mais rápido que StringBuffer devido à ausência de sincronização.
- Para segurança nas threads use StringBuffer, mas se não precisa e quer mais e quer velocidade, StringBuilder é melhor.

## Métodos importantes:
1 - delete(int start, int end): Remove caracteres
2 - insert(int offset, String s): insere string em posição específica.
3 - replace(int start, int end, String s): Substitui parte da string.
4 - reverse() Inverte a string
5 - setCharAt(inx index, char ch): Altera caractere específico.