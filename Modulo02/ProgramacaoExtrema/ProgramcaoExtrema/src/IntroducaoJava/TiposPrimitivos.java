package IntroducaoJava;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Declaração e inicialização de tipos primitivos
        byte b = 100; // 8bits
        short s = 30000; // 16bits
        int i = 1000000; // 32bits
        long l = 10000000000L; // 64bits

        float f = 3.14f; // ponto fluante, precisão simples
        double d = 3.1415; // ponto fluante, precisão dupla

        char c = 'a'; // Caractere unico

        boolean bo = true; // Verdadeiro ou falso

        // Impressão de valores no console
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + bo);
    }
}
