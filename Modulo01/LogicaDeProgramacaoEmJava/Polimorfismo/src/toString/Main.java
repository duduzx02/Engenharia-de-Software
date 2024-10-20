package toString;

public class Main {
    public static void main(String[] args) {
        String primera = "Java";
        String segunda = new String("Java");
        System.out.println(primera == segunda);
        System.out.println(primera.equals(segunda));

        System.out.println(primera.toUpperCase());
        System.out.println(segunda.length());


    }
}
