public class Matriz {
    public static void main(String[] args) {

        // Criando uma matriz com 3 linhas e 3 colunas
        // Declaração e Inicialização de uma Matriz
        int[][] matriz = new int[3][3];

        int[][] matriz2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int valor = matriz2 [1][2]; // acessando o valor na linha 1 e coluna 2
        System.out.println("O valor da linha 1 e coluna 2 é: " + valor); // 6

        // alterando o valor na lina 0, coluna 0
        matriz2[0][0] = 10;
        System.out.println("O valor da linha 0 e coluna 0 é: " + matriz2[0][0]);

        // Imprimindo os elementos da matriz

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println(); // Nova linha após cada linha da matriz
        }

    }
}
