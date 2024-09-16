Correto! Vamos explorar os **métodos** em Java com mais detalhes.

### O que é um método?

Um método é um bloco de código que executa uma tarefa específica. Eles ajudam a dividir o código em partes menores e
reutilizáveis, tornando a solução de problemas mais fácil e organizada. Com métodos, é possível **reutilizar código**, *
*modularizar** o programa e facilitar a **manutenção**.

### Estrutura de um Método

A estrutura básica de um método em Java é:

```java
modificador_de_acesso tipo_de_retorno

nomeDoMetodo(parametros) {
    // bloco de código do método
}
```

#### Partes de um Método:

- **Modificador de acesso**: Define quem pode acessar o método (por exemplo: `public`, `private`, `protected`).
- **Tipo de retorno**: O tipo de dado que o método vai retornar. Pode ser um tipo primitivo (como `int`, `double`) ou um
  objeto. Se o método não retornar nada, usamos `void`.
- **Nome do método**: Descreve o que o método faz. Deve seguir as convenções de nomenclatura (iniciando com letra
  minúscula e camelCase).
- **Parâmetros** (opcional): Dados que o método precisa para executar sua tarefa.
- **Bloco de código**: O conjunto de instruções que define o comportamento do método.

### Tipos de Métodos

1. **Métodos definidos pelo usuário**: São os métodos que você cria de acordo com as necessidades do seu programa.
   Exemplo:

   ```java
   public int somar(int a, int b) {
       return a + b;
   }
   ```

   Neste exemplo, criamos o método `somar` que recebe dois inteiros e retorna a soma deles.

2. **Métodos de biblioteca padrão**: Java possui várias bibliotecas padrão que oferecem métodos prontos para uso. Por
   exemplo, a classe `Math` tem vários métodos úteis.
   Exemplo:

   ```java
   int resultado = Math.max(10, 20); // Retorna o maior número entre 10 e 20
   ```

### Modificadores de Acesso

Os modificadores de acesso determinam a visibilidade de um método. Existem três principais modificadores:

- **`public`**: O método pode ser acessado de qualquer lugar, dentro ou fora da classe.
- **`private`**: O método só pode ser acessado dentro da própria classe.
- **`protected`**: O método pode ser acessado por classes do mesmo pacote ou por subclasses (mesmo fora do pacote).

### Exemplos de Métodos com Modificadores de Acesso

1. **Public**:

   ```java
   public class Calculadora {
       public int somar(int a, int b) {
           return a + b;
       }
   }
   ```

   O método `somar` pode ser chamado de qualquer outra classe.

2. **Private**:

   ```java
   public class ContaBancaria {
       private double saldo;

       private void atualizarSaldo(double valor) {
           saldo += valor;
       }
   }
   ```

   O método `atualizarSaldo` só pode ser usado dentro da classe `ContaBancaria`.

3. **Protected**:

   ```java
   public class Funcionario {
       protected double salario;

       protected void calcularSalario() {
           // lógica para calcular o salário
       }
   }
   ```

   O método `calcularSalario` pode ser acessado por subclasses de `Funcionario`, mesmo que estejam em outros pacotes.

### Chamando Métodos

Para usar um método, basta **invocá-lo** em outra parte do código:

```java
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(5, 3);
        System.out.println("Resultado: " + resultado);
    }
}
```

Este código chama o método `somar` da classe `Calculadora` e imprime o resultado.

---

Essa é a base dos métodos em Java! Se precisar de exemplos mais específicos ou quiser explorar mais a fundo, estou à
disposição.