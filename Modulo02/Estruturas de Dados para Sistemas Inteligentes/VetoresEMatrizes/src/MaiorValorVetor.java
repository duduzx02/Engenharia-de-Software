public class MaiorValorVetor {

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};
        int maior = 0;

        for (int num : numeros){
            if (num > maior){
                maior = num;
            }
        }

        System.out.println("Maior valor: " + maior);

    }
}
