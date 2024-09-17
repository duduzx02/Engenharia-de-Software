public class Vetores {
    public static void main(String[] args) {
        // Declarar um vetor com um tamanho fixo:
        int[] numeros = new int[5]; // Vetor de inteiros com 5 elementos

        // Declarar e inicializar um vetor com valores:
        int[] numeros2 = {1, 2, 3, 4, 5}; // Vetor inicializado com valores

        // Acessando elementos de um vetor:

        // Acessar elementos do vetor
        System.out.println(numeros2[0]); // 1
        System.out.println(numeros2[3]); // 4

        // Modificar elementos do vetor
        numeros2[2] = 100;
        System.out.println(numeros2[2]); // 100


        // Percorrendo um vetor:

        // Com `for` tradicional:
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", "); // 0, 0, 0, 0, 0
            // 5 zeros porque o tamanho do vetor é 5 e não foi declarado valores
        }

        System.out.println();
        // Com `for-each`:
        for (int numero : numeros2){
            System.out.print(numero + ", "); // 1, 2, 100, 4, 5
        }
        System.out.println();

        // Exemplo de operações com vetores:

        int[] numeros3 = {5, 10, 15, 20, 25};
        int soma = 0;
        for(int numero : numeros3){
            soma += numero;
        }

        System.out.println(soma);
    }
}
