package AClasseString;

import java.sql.SQLOutput;

public class MetodosImportantes {
    public static void main(String[] args) {
        String x = "Avião";
        System.out.println(x.charAt(2));

        String y = "livro";
        System.out.println(y.concat(" de programação"));

        String z = "JAVA";
        System.out.println(z.equalsIgnoreCase("java"));

        String w = "Java";
        System.out.println(w.length());

        String v = "xoxo";
        System.out.println(v.replace('x', 'y'));
    }
}
