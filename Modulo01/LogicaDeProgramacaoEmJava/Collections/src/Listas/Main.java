package Listas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lingaugens = new ArrayList<>();

        lingaugens.add("Java");
        lingaugens.add("Python");
        lingaugens.add("C++");
        lingaugens.add("C#");

        System.out.println("ArrayList: " + lingaugens);

        String[] arr = new String[lingaugens.size()];
        lingaugens.toArray(arr);

        System.out.println("Array: ");
        for(String x : arr){
            System.out.println(x);
        }
     }
}
