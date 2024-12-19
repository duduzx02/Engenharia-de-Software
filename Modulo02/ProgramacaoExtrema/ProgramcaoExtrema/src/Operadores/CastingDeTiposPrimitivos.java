package Operadores;

public class CastingDeTiposPrimitivos {
    public static void main(String[] args) {
        // Com conversão explícita(quando há perda de precisão)
        int a = 130;
        byte b = (byte) a; // Necessita de casting explícito
        System.out.println(b); // Resultado -126

        // Sem conversão explícita
        byte x = 20;
        int y = x; // Conversão implícita automatica
        System.out.println(y);
    }
}
