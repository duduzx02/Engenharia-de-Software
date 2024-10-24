package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            numeros.add(i, i +1);
        }
        System.out.println(numeros.get(4));
    }
}
