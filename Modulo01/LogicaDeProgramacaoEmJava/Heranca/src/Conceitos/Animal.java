package Conceitos;

public class Animal {
    public void comer(){
        System.out.println("animal está comendo");
    }
}

class Cachorro extends Animal{
    public void late(){
        System.out.println("cachorro late");
    }
}

class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.comer();
        cachorro.late();
    }
}
