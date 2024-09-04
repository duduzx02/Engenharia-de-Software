public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        
        boolean resultado = a && b;
        System.out.println("O resultado e: " + resultado);

        resultado = a || b;
        System.out.println("O resultado e: " + resultado);

        resultado = !a;
        System.out.println("O resultado e: " + resultado);

        int x = 10;
        int y = 20;

        boolean result = x == y;
        System.out.println("O resultado e: " + result);
        System.out.println("O resultado é: " + (x != y));
        System.out.println("O resultado é: " + (x > y));
        System.out.println("O resultado é: " + (x < y));
        System.out.println("O resultado é: " + (x >= 10));
        System.out.println("O resultado é: " + (y <= 20));
    }
}
