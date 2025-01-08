package metodos;

public class Recursividade {
    public int fatorial(int num) {
        return (num == 0) ? 1 : num * fatorial(num - 1);
    }

    public static void main(String[] args) {

        Recursividade obj = new Recursividade();
        int recu = obj.fatorial(3);

        System.out.println(recu);

    }
}