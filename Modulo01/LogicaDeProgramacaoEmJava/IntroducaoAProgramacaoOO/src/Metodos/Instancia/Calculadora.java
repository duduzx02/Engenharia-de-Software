package Metodos.Instancia;

public class Calculadora {
    public int somar(int a, int b){
        return a + b;
    }


}

class Main{
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(3, 5);
        System.out.println(resultado);
    }
}


