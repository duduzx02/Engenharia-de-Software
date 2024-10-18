package SobrecargaMetodos;

public class Desenho {

    public void desenhar(){
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }
    }

    public void desenhar(String texto){
        for (int i = 0; i < 10; i++) {
            System.out.println(texto);
        }
    }

    public void desenhar(String texto, int qtd){
        for (int i = 0; i < qtd; i++) {
            System.out.println(texto);
        }
    }
}
