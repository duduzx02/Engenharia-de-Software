public class ExemploSobrecrita {

}

class Animal{
    void fazerSom(){
        System.out.println("Som do animal");
    }

}

class Cachorro extends Animal{
    void fazerSom(){
        System.out.println("Som do cachorro latindo");
    }
}
