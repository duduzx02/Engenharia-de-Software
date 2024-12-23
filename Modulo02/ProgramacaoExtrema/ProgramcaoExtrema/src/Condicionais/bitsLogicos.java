package Condicionais;

public class bitsLogicos {
    public static void main(String[] args) {
        int var1 = 23;
        int var2 = 33;

        int resultadoAND = var1 & var2;
        int resultadoOR = var1 | var2;
        int resultadoXOR = var1 ^ var2;
        int resultadoNOT = ~var1;

        System.out.println("Resultado AND: " + resultadoAND);
        System.out.println("Resultado OR: " + resultadoOR);
        System.out.println("Resultado XOR: " + resultadoXOR);
        System.out.println("Resultado NOT: " + resultadoNOT);
    }
}
