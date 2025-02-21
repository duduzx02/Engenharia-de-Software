import java.util.Scanner;

public class VetorScanner {
    // Vetor preenchido pelo usuário
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[5];

        System.out.println("Digite 5 números: ");

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Posição " + (i + 1)+ ": ");
            valores[i] = sc.nextInt();

        }

        System.out.println("Valores digitados: ");
        for(int num: valores){
            System.out.println(num);
        }
    }
}
