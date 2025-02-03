package Colecoes;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        Map<Integer, String>  lmap = new LinkedHashMap<>();

        lmap.put(12, "Maria");
        lmap.put(5, "Nicole");
        lmap.put(2, "João");
        lmap.put(8, "Joaquim");

        System.out.println("linkedHashMap antes de modificações: " + lmap);

        System.out.println("Funcionário ID 12 existe? " + lmap.containsKey(12));
        System.out.println("Funcionário João existe? " + lmap.containsValue("João"));

        System.out.println("Número total de funcionários: " + lmap.size());

        System.out.println("Removendo funcionário com ID 5: " + lmap.remove(5));
        System.out.println("LinkedHashMap depois de modificações: " + lmap);
    }
}
