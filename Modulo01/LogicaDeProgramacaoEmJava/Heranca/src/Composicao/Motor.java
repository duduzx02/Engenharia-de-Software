package Composicao;

public class Motor {
    public void ligar(){
        System.out.println("Motor ligado.");
    }
}

class Carro{
    private Motor motor;

    Carro(){
        this.motor = new Motor();
    }

    void ligarCarro(){
        motor.ligar();
        System.out.println("Carro ligado.");
    }
}

class Main3{
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ligarCarro();
    }
}