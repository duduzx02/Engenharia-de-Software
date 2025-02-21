public class VetorExemplo {
    public static void main(String[] args) {
        // Criando um vetor de 5 posições
        int[] numeros = new int[5];

        // Preenchendo o vetor manuamente
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Imprimindo o valor de cada elemento do vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
    }
}
