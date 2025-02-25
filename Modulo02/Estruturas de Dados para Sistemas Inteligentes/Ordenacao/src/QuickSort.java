import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array, int left, int right) {
        if(left < right) {
            int pivot = partition(array, left, right);
            quickSort(array, left, pivot - 1);
            quickSort(array, pivot+1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if(array[j] <= pivot) {
                i++;
                // troca os elementos
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // coloca o pivo na posicao correta
        int temp = array[i+1];
        array[i+1] = array[right];
        array[right] = temp;
        return i+1;
    }
    public static void main(String[] args) {
        int[] array = {25, 57, 48, 37, 12, 92, 86, 34};
        System.out.println("Array original: " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }
}
