public class ExemploClasseAbstrata {
}

abstract class Forma{
    abstract void desenhar();
}

class Circulo extends Forma{
    @Override
    void desenhar(){
        System.out.println("Desenhar circulo");
    }
}
