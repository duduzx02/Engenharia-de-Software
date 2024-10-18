package SobrecargaMetodos;

public class Main {
    public static void main(String[] args) {
        Desenho d = new Desenho();
        d.desenhar();

        d.desenhar("teste");

        d.desenhar("Gusto", 2);
    }
}
