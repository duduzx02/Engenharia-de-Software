package IntroducaoJava;

public class Classes {
    class Carro{
        String cor; // propriedade cor
        int velocidadeMaxima; // propriedade velocidade máxima

        // Método para exibir informações do carro
        public void exibirInformacoes(){
            System.out.println("Cor: " + cor);
            System.out.println("Velocidade máxima: " + velocidadeMaxima + "km/h");
        }
    }
}

class Mai{
    public static void main(String[] args) {
        Classes.Carro carro = new Classes().new Carro(); // instanciando um objeto da classe carro
        carro.cor = "Prata";
        carro.velocidadeMaxima = 300;
        carro.exibirInformacoes();
    }
}
