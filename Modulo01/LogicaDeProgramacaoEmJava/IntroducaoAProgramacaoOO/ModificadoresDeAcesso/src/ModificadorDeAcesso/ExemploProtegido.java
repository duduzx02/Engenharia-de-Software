package ModificadorDeAcesso;

public class ExemploProtegido {
    protected int valor;

    protected void metodoProtegido() {
        System.out.println("Método protegido acessível por subclasses.");
    }
}