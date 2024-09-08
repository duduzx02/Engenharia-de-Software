### Estrutura de Repetição `do/while`

A estrutura de repetição `do/while` em Java é usada para repetir um bloco de código enquanto uma condição for
verdadeira. O principal diferencial do `do/while` em relação ao `while` simples é que o bloco de código é executado *
*pelo menos uma vez**, independentemente de a condição ser verdadeira ou não. Isso acontece porque a condição é
verificada **depois** da execução do bloco.

#### Sintaxe do `do/while`

```java
do{
        // Bloco de código que será executado
        }while(condição);
```

- **Bloco de código**: O código dentro do bloco `do` será executado.
- **Condição**: Após a execução do bloco, a condição dentro do `while` será avaliada. Se a condição for verdadeira, o
  código será executado novamente; se for falsa, o loop será encerrado.

#### Exemplo 1: Loop simples com `do/while`

```java
public class ExemploDoWhile {
    public static void main(String[] args) {
        int contador = 1;

        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 5); // O loop será repetido até que o contador seja maior que 5
    }
}
```

**Saída:**

```
Contador: 1
Contador: 2
Contador: 3
Contador: 4
Contador: 5
```

Nesse exemplo, o código imprime o valor de `contador` e incrementa em cada iteração, enquanto a condição `contador <= 5`
for verdadeira.

#### Exemplo 2: Exemplo com condição inicialmente falsa

```java
public class ExemploDoWhile {
    public static void main(String[] args) {
        int contador = 6;

        do {
            System.out.println("Contador: " + contador);
        } while (contador <= 5);
    }
}
```

**Saída:**

```
Contador: 6
```

Mesmo que a condição `contador <= 5` seja falsa logo no início, o bloco dentro do `do` ainda será executado **uma vez**,
pois a verificação da condição acontece depois.

### Diferença entre `while` e `do/while`

- **`while`**: A condição é verificada antes da execução do bloco de código. Se a condição for falsa desde o início, o
  código dentro do loop nunca será executado.
- **`do/while`**: O bloco de código é executado pelo menos uma vez, pois a condição só é verificada após a execução do
  bloco.

#### Exemplo comparativo:

**Com `while`:**

```java
int contador = 6;
while(contador <=5){
        System.out.

println("Contador: "+contador); // Não será executado
}
```

**Com `do/while`:**

```java
int contador = 6;
do{
        System.out.

println("Contador: "+contador); // Será executado uma vez
}while(contador <=5);
```

### Resumo:

- A estrutura `do/while` garante que o bloco de código seja executado pelo menos uma vez, independentemente da condição
  ser verdadeira ou falsa no início.
- A verificação da condição é feita **depois** da execução do bloco de código.
- Útil quando você quer garantir que o código execute ao menos uma vez antes de validar uma condição.