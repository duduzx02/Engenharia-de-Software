import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        while(numero != 0) {
            System.out.println(numero);
            numero = scanner.nextInt();
        }
    }
}
