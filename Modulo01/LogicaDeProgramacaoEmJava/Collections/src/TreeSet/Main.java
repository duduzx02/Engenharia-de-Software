package TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(8);
        numeros.add(6);
        numeros.add(9);

        System.out.println(numeros); // [6, 8, 9] o conjunto dos elementos

        System.out.println("Removeu o elemento ?"+ numeros.remove(6)); // Mostra true se tinha 6 e se removeu

        System.out.println(numeros);

        System.out.println("Contem o elemento ?"+numeros.contains(8)); // Mostra tru se conter o elemento

        System.out.println("Tamanho do conjunto: "+numeros.size()); // Mostra o tamanho do conjunto
        numeros.removeAll(numeros); // Remove todos  os elementos

        System.out.println(numeros);

    }
}
