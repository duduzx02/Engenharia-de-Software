package metodos;

public class exemplosDeMetodos {
    // método com retorno
    public void exibirmensagem(){
        System.out.println("oi");
    }

    public String unirDuasStrings(String str1, String str2){
        return str1 + str2;
    }



    public static void main(String[] args) {

        exemplosDeMetodos obj = new exemplosDeMetodos();
        obj.exibirmensagem();
        String str = obj.unirDuasStrings("ola", "mundo");
        System.out.println(str);


    }
}
