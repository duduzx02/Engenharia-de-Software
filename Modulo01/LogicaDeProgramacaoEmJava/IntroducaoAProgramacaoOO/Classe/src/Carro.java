public class Carro {
    // Atributos
    private String modelo;
    private int ano;

    // Construtor
    public Carro (String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Metodos
    public void mostrarDetalhes(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }

    public static void main(String[] args) {
        Carro gol = new Carro("Gol", 2019);
        Carro palio = new Carro("Palio", 2018);
        Carro corsa = new Carro("Corsa", 2017);

        gol.mostrarDetalhes();
        palio.mostrarDetalhes();
        corsa.mostrarDetalhes();
    }
}


