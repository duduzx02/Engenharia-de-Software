package ListsEArraysLists;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        // Criando um ArrayList do tipo Integer
        ArrayList <Integer> numeros = new ArrayList<>();

        // Adicionando elementos ao ArrayList
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Acessando um elemento pelo índice
        System.out.println("Elemento no índice 1: " + numeros.get(1));

        // Verificando se a lista contém um determinado valor
        System.out.println("A lista contém 20? " + numeros.contains(20));

        // Removendo o elemento no índice 0
        numeros.remove(0);

        // Imprimindo o tamanho da lista e seus elementos
        System.out.println("Tamanho da lista: " + numeros.size());
        System.out.println("Números: " + numeros);



    }
}
