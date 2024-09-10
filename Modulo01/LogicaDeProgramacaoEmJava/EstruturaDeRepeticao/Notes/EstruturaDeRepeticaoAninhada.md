Estrutura de repetição aninhada, ou "loop aninhado", ocorre quando um loop está dentro de outro. É uma técnica útil em
diversas situações, como percorrer matrizes bidimensionais, realizar cálculos complexos ou gerar padrões repetitivos.

### Como funciona:

- O **loop externo** executa uma vez e, para cada iteração, o **loop interno** é executado por completo.
- Depois que o loop interno termina, o loop externo avança para a próxima iteração e o processo se repete.

### Exemplo em Java:

```java
public class ExemploAninhado {
    public static void main(String[] args) {
        // Loop externo (controla as linhas)
        for (int i = 1; i <= 3; i++) {
            System.out.println("Linha " + i);

            // Loop interno (controla as colunas)
            for (int j = 1; j <= 4; j++) {
                System.out.println("   Coluna " + j);
            }
        }
    }
}
```

### Explicação:

- O loop externo (`for` com `i`) controla as **linhas**.
- O loop interno (`for` com `j`) controla as **colunas**.
- Para cada linha, ele imprime as colunas associadas, repetindo o processo.

### Saída:

```
Linha 1
   Coluna 1
   Coluna 2
   Coluna 3
   Coluna 4
Linha 2
   Coluna 1
   Coluna 2
   Coluna 3
   Coluna 4
Linha 3
   Coluna 1
   Coluna 2
   Coluna 3
   Coluna 4
```

### Resumo:

- **Estrutura de repetição aninhada** é quando um loop está dentro de outro.
- O loop externo controla o número de iterações totais, e o loop interno é executado completamente para cada iteração do
  externo.
- É útil para percorrer estruturas como matrizes, tabelas ou criar padrões repetitivos.