package IntroducaoJava;

public class Variaveis {
    // Variável de instância
    int instancia;

    public static void main(String[] args) {
        Variaveis obj = new Variaveis();

        // Variável local precisa ser inicializada aantes de ser usada
        int local = 10;

        // Imprime a variável local
        System.out.println("Variável local: " + local);

        // Imprime a variável de instância com o valor padrão
        System.out.println("Variável de instância: " + obj.instancia);


    }
}
