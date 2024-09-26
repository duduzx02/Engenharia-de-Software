public class ExemploDeComposicao {
}

class Motor{
    void ligar(){
        System.out.println("O motor foi ligado");
    }
}

class Carroo{
    Motor motor = new Motor();
    void ligarMotor(){
        motor.ligar();
        System.out.println("O carroo está ligado");
    }
}