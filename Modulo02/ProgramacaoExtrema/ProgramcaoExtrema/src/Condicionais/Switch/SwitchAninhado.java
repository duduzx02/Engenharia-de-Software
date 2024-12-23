package Condicionais.Switch;

public class SwitchAninhado {
    public static void main(String[] args) {
        int nivel = 2;
        char tipo = 'B';

        switch (nivel){
            case 1:
                System.out.println("nível 1");
                case 2:
                    System.out.println("Nível 2");
                    switch (tipo){
                        case 'A':
                            System.out.println("Tipo A no nível 2");
                            break;
                        case 'B':
                            System.out.println("Tipo B no Nível 2");
                            break;
                        default:
                            System.out.println("Tipo desconhecido");
                    }
                    break;
            default:
                System.out.println("Nível desconhecido!");
        }
    }
}
