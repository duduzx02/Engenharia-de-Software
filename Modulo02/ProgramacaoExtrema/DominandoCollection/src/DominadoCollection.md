#Java Collection

- Uma estrutura de dados que não apenas armazena dados, mas também suporta operações para acessar e manipular os dados. 

## Principais atividades com o Collections framework
- Adicionar objetos à coleção.
- Remover
- Procurar
- Recuperar/obter
- Iterar sobre a coleção para funcionalidades específicas.

## Interfaces e classes-chave do Collecions framework
- coleção: representa qualquer estrutura de dados.
- Collection é uma interface
- Collections contém métodos estáticos.

## Tipos báscios de coleção:
### List
- Interface de coleção ordenada, permitindo duplicatas
- Fornece métodos orientados à posição e iterados bidirecionais.
- Implementações: ArrayList, LinkedList e Vector.
### Set
- Garante não duplicação na coleção
- Classes concretas: HashSet, LinkedHasheSet e TreeSet
### Map
- Armazena pare de chave-valor
- As chaves não podem ser duplicadas.
- Implementações: HashMap, HashTable, TreeMap e LinkedHashMap
### Queue
- Estrutura do tipo FIFO(First in, First Out).

## Outras classificaçõesde coleções
- Ordenado: a coleção segue uma ordem específica.
- CLassificado: A ordem dos elementos segue uma regra ou critério de classificação

## Iteradores
### Interface Iterator
- Permite percorrer a coleção passo a passo.
- - boolean hasNext(): Verifica se há mais elementos.
- - object next(): Retorna o próximo objeto e avança o cursor.
### Interface Comparator
- Classifica coelções sem modificar as classes: método:
- - ````int compare(Object obj1, Object obj2):````
- - - Retorna um valor negativo se obj1 < obj2
- - - Retorna 0 se obj1 == obj2.
- - - Retorna um valor positivo se obj1 > obj2.

## Classe ArrayList
- Armazena elementos de forma redimensionável.
- É uma coleção ordenada por índice, mas não classificada.
- Métodos principais: add(), get(), contains(), size(), remove().

## Classe LinkedList
- Lista duplamente ligada, ideal para inserções e remoções rápidas.
- Métodos para adição e remoção no início ou fim.