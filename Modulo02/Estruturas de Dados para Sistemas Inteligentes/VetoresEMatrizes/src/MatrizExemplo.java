public class MatrizExemplo {
    public static void main(String[] args) {
        // Criando uma matriz 3x3
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Imprimindo o valor de cada elemento da matriz
        for(int i = 0; i < matriz.length; i++){ // Percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) { // Percorre as colunas
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
