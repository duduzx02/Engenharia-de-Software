package ExmplosDeHeranca;

public class MainJava {
    public static void main(String[] args) {
        CachorroJava cachorro = new CachorroJava();
        cachorro.setNome("Toto");
        cachorro.mostrar();

        GatoJava gato = new GatoJava();
        gato.setNome("Mimi");
        gato.mostrar();
    }
}
