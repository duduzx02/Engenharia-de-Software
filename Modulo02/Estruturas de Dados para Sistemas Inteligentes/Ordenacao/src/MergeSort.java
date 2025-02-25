import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(array, inicio, meio);
            mergeSort(array, meio + 1, fim);
            merge(array, inicio, meio, fim);
        }
    }

    private static void merge(int[] array, int inicio, int meio, int fim) {
        int[] esquerda = Arrays.copyOfRange(array, inicio, meio + 1);
        int[] direita = Arrays.copyOfRange(array, meio + 1, fim + 1);

        int i = 0, j = 0, k = inicio;

        // Junta as duas metades ordenadas
        while (i < esquerda.length && j < direita.length) {
            if (esquerda[i] <= direita[j]) {
                array[k++] = esquerda[i++];
            } else {
                array[k++] = direita[j++];
            }
        }

        // Copia elementos restantes da esquerda
        while (i < esquerda.length) {
            array[k++] = esquerda[i++];
        }

        // Copia elementos restantes da direita
        while (j < direita.length) {
            array[k++] = direita[j++];
        }
    }

    public static void main(String[] args) {
        int[] array = {25, 57, 48, 37, 12, 92, 86, 33};
        System.out.println("Array original: " + Arrays.toString(array));

        mergeSort(array, 0, array.length - 1);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }
}
