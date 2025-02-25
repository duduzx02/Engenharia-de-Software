public class RecusaoHead {
    public static void misterio(int x){
        if(x > 0){
            misterio(x - 1);// Chamada recursiva no início
            System.out.println(x); // Processamento após a chamada recursiva
        }
    }

    public static void main(String[] args) {
        misterio(5);
    }
}
