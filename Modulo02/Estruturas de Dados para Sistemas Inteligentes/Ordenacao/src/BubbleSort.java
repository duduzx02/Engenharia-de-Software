public class BubbleSort {
    public static void bubbleSort(int[] array){
        int n = array.length;
        boolean trocou;

        for (int i = 0; i < n-1 ; i++) {
            trocou = false;
            for (int j = 0; j < n - 1 -i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    trocou = true;
                }
            }
            // Se não houve troca, o array ja esta ordenado
            if (!trocou) break;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 2, 1, 5, 7, 8, 10, 2};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
