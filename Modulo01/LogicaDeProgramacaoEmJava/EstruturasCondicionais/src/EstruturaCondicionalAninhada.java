public class EstruturaCondicionalAninhada {
    public static void main(String[] args) {
        int numero = -1;

        if(numero > 0){
            System.out.println("O número é positivo.");
            if (numero % 2 == 0){
                System.out.println("O número é par.");
            } else {
                System.out.println("O número é ímpar.");
            }
        } else {
            System.out.println("O número é negativo ou zero.");
        }
    }
}
