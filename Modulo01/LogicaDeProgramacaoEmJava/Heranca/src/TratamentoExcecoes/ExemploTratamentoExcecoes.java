package TratamentoExcecoes;

public class ExemploTratamentoExcecoes {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: Tentativa de acessar um índice inválido do array");
        } finally {
            System.out.println("Fim do programa");
        }
    }
}
