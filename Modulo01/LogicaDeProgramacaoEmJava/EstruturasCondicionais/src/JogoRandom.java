import java.util.Random;
import java.util.Scanner;

public class JogoRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100);
        int chute = scanner.nextInt();

        if(chute == numeroAleatorio){
            System.out.println("Parabéns, voce acertou!");
        } else {
            System.out.println("Fim do jogo!");
        }
        System.out.println(numeroAleatorio);

    }
}
