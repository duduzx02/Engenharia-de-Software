package TratamentoExcecoes;

public class ExemploThrow {
    public static void verificarIdade(int idade){
        if (idade < 18){
            throw new IllegalArgumentException("Idade deve ser maior ou igual a 18.");
        }
    }

    public static void main(String[] args) {
        try{
            verificarIdade(17);
        } catch (Exception e){
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
