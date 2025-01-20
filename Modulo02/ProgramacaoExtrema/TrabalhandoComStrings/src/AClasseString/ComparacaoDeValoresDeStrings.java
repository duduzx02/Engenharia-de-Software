package AClasseString;

public class ComparacaoDeValoresDeStrings {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");

        String s3 = "java";
        String s4 = "javac";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
