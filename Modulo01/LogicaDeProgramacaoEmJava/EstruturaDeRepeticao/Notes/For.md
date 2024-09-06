A estrutura de repetição `for` em Java é utilizada para repetir um bloco de código um número específico de vezes. A
sintaxe básica do laço `for` é:

```java
for(inicialização;condição;incremento/decremento){
        // Bloco de código a ser repetido
        }
```

### Componentes do `for`:

1. **Inicialização**: Declara e inicializa a variável de controle do laço (normalmente uma variável inteira).
2. **Condição**: Verifica se a condição é verdadeira antes de executar o bloco de código. Se for falsa, o laço é
   encerrado.
3. **Incremento/Decremento**: Atualiza a variável de controle após cada iteração.

### Exemplo simples:

Vamos ver um exemplo de como imprimir os números de 1 a 5:

```java
public class ExemploFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }
    }
}
```

### Explicação:

1. **Inicialização**: `int i = 1` — A variável `i` começa com o valor 1.
2. **Condição**: `i <= 5` — O laço continua enquanto `i` for menor ou igual a 5.
3. **Incremento**: `i++` — A cada iteração, o valor de `i` é incrementado em 1.

### Resultado:

```
Número: 1
Número: 2
Número: 3
Número: 4
Número: 5
```

### Usando o `for` com arrays:

Podemos também utilizar o laço `for` para percorrer arrays. Aqui está um exemplo que percorre um array de inteiros e
imprime seus valores:

```java
public class ExemploForArray {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número: " + numeros[i]);
        }
    }
}
```

### Explicação:

- `numeros.length`: Retorna o tamanho do array (número de elementos).
- `i++`: Incrementa o índice para acessar o próximo elemento do array.

### Resultado:

```
Número: 10
Número: 20
Número: 30
Número: 40
Número: 50
```

Se tiver dúvidas ou quiser ver mais exemplos com o laço `for`, pode perguntar!