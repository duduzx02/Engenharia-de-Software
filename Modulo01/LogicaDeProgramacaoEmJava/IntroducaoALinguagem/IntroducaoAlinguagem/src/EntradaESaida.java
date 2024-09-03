import java.util.Scanner;

public class EntradaESaida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada
        int a = input.nextInt();
        double b = input.nextDouble();
        String c = input.next();

        // Saida
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
