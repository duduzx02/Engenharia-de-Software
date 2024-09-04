Estruturas condicionais aninhadas em Java são quando você coloca uma estrutura condicional dentro de outra. Essas
estruturas permitem tomar decisões mais complexas, verificando várias condições ao mesmo tempo.

## Exemplo básico

Aqui está um exemplo simples de uma estrutura condicional aninhada em Java:

```java
public class ExemploCondicionalAninhada {
    public static void main(String[] args) {
        int numero = 10;

        if (numero > 0) {
            System.out.println("O número é positivo.");

            if (numero % 2 == 0) {
                System.out.println("O número é par.");
            } else {
                System.out.println("O número é ímpar.");
            }

        } else {
            System.out.println("O número é negativo ou zero.");
        }
    }
}
```

### Explicação:

- **Primeira condição (`if (numero > 0)`)**: Verifica se o número é positivo.
- **Segunda condição aninhada (`if (numero % 2 == 0)`)**: Só é avaliada se a primeira condição for verdadeira. Aqui,
  verificamos se o número é par.
- **Se a primeira condição for falsa**: O programa pula para a estrutura `else`, que lida com números negativos ou zero.

### Saída esperada:

Para `numero = 10`, a saída seria:

```
O número é positivo.
O número é par.
```

Esse tipo de estrutura é útil quando você precisa verificar várias condições que dependem umas das outras. As
condicionais aninhadas podem ser mais complexas, mas a ideia principal é que uma verificação ocorre dentro de outra.