package Metodos.Abstrato;

public abstract class Humano {
    public abstract void falar();
}

class Homem extends Humano {
    @Override
    public void falar() {
        System.out.println("Merda");
    }
}

class Main{
    public static void main(String[] args) {
        Homem h = new Homem();
        h.falar();
    }
}
