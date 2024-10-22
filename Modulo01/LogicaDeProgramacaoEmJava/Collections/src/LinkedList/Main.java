package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> animais = new LinkedList<>();

        animais.add("Elefante");
        animais.add("Cachorro");
        animais.add("Gato");

        System.out.println("Linkedlist: " + animais);

        animais.add(1, "Cavalo");

        System.out.println("Linkedlist: " + animais);
    }
}
