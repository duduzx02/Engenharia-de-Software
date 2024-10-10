package Abstract;

abstract class Animal {
    String nome;

    public abstract void emitirSom(); // Método abstrato

    public void dormir(){
        System.out.println("Animal dormindo");
    }
}

class Cachorro extends Animal{
    public void emitirSom(){
        System.out.println("Au au");
    }
}
