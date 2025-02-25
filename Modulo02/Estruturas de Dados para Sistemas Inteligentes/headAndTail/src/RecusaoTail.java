public class RecusaoTail {
    public static void misterio(int x){
        if(x > 0){
            System.out.println(x); // Processamento após a chamada recursiva
            misterio(x - 1); // Chamada recursiva no final
        }
    }

    public static void main(String[] args) {
        misterio(5);
    }
}
