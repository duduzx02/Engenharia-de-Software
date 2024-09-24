package ListsEArraysLists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // Criando uma lista do tipo String
        List<String> frutas = new ArrayList<>();

        // Adicionando elementos à lista
        frutas.add("Macã");
        frutas.add("Banana");
        frutas.add("Laranja");

        // Acessando elementos da lista
        System.out.println("Fruta na posição 1: " + frutas.get(1));

        // Modificando o elemento na posição 0
        frutas.set(0, "Manga");

        // Removendo o elemento na posição 2
        frutas.remove(2);

        // Imprimindo o tamanho da lista e os elementos
        System.out.println("Tamanho da lista: " + frutas.size());
        System.out.println("Frutas: " + frutas);
    }
}
