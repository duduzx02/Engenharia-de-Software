package TratamentoExcecoes;

public class ExemploThrows {
    public static void metodoQueLancaExcecao() throws Exception {
        throw new Exception("Exceção disparada");
    }

    public static void main(String[] args) {
        try {
            metodoQueLancaExcecao();
        } catch (Exception e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
