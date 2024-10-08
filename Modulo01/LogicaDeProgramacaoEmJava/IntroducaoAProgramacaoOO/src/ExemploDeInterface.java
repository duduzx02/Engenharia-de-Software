public class ExemploDeInterface implements Animal2{
    @Override
    public void fazerSom() {
        // Fui obrigado a implementar aqui também
    }
}

interface Animal2{
    void fazerSom();
}

class Gato implements Animal2{
    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }
}
