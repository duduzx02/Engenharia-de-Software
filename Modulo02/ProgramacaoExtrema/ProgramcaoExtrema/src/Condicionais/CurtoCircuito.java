package Condicionais;

public class CurtoCircuito {
    public static void main(String[] args) {
        if((2<3) && (3<4)){
            System.out.println("Condição verdadeira para AND(&&");
        }

        if((2>3) || (3<4)){
            System.out.println("Condição verdadeira para OR(||)");
        }
    }
}
