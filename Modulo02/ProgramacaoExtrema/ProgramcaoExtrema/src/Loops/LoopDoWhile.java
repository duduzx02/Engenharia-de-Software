package Loops;

public class LoopDoWhile {
    public static void main(String[] args) {

        int var = 10;
        do{
            var += 10;
            System.out.println("Contador do Loop: " + var);
        } while (var < 10);
    }
}
