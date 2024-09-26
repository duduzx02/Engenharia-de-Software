public class ExemploDeInterface implements Animal{
    @Override
    public void fazerSom() {
        // Fui obrigado a implementar aqui também
    }
}

interface Animal{
    void fazerSom();
}

class Gato implements Animal{
    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }
}
