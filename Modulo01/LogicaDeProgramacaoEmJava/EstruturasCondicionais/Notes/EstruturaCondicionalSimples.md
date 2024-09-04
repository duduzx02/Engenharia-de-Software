# Uma estrutura condicional simples em Java permite que você tome decisões em seu código com base em uma condição específica. A forma mais comum de expressar uma condição em Java é usando a palavra-chave `if`. Aqui está um exemplo básico:

```java
public class Main {
    public static void main(String[] args) {
        int numero = 10;

        if (numero > 5) {
            System.out.println("O número é maior que 5.");
        }

        System.out.println("Este código sempre será executado.");
    }
}
```

### Explicação:

- **`if (numero > 5)`**: Essa é a estrutura condicional simples. Ela verifica se a condição entre parênteses é
  verdadeira. Se for, o bloco de código dentro das chaves `{}` é executado.
- **`System.out.println("O número é maior que 5.");`**: Essa linha só será executada se a condição `numero > 5` for
  verdadeira.
- **`System.out.println("Este código sempre será executado.");`**: Essa linha de código será executada independentemente
  da condição anterior, porque está fora do bloco `if`.

### Exemplo Prático:

Suponha que você queira verificar se um número é par ou ímpar:

```java
public class Main {
    public static void main(String[] args) {
        int numero = 7;

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        }
    }
}
```

Aqui, a condição `numero % 2 == 0` verifica se o resto da divisão do número por 2 é igual a 0. Se for, o número é par, e
a mensagem "O número é par." é exibida. Se o número for ímpar, nada será exibido, pois não há uma instrução `else`.

