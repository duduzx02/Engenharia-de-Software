package Condicionais.Switch;

public class Switch {
    public static void main(String[] args) {
        char grau = 'A';

        switch(grau){
            case 'A':
                System.out.println("Bônus: 1000");
                break;
            case 'B':
                System.out.println("Bônus: 500");
                break;
            default:
                System.out.println("Sem bônus");
        }
    }
}
