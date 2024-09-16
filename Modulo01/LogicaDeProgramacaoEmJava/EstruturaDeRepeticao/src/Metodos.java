public class Metodos {
    // Métodos definidos pelo usuário
    public int somar(int a, int b){
        return a + b;
    }

    // Métodos de biblioteca padrão
    int resultado = Math.max(10, 20); // Retorna o maior número entre 10 e 20

    // Métodos com modificadores de acesso
    // Public:
    public int somar(double a, double b){
        return (int) (a + b);
    } // O método pode ser chamado de qualquer outra classe.

    // Private:
    private double saldo;

    private void atualizarSaldo(double valor){
        saldo += valor;
    } // O método só pode ser usado dentro da classe.

    // Protected:
    protected double salario;

    protected void calcularSalario(){
        // lógica para calcular o salário
    } // O método pode ser acessado por subclasses de `Funcionario`, mesmo que estejam em outros pacotes.

}
