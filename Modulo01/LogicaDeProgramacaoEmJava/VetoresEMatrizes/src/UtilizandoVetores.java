public class UtilizandoVetores {
    public static void main(String[] args) {

        int[] passarosPorDia = {2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3, 1};

        int totalPassaros = 0;
        int passarosPrimeiraSemana = 0;
        int passarosSegundaSemana = 0;

        for (int i = 0; i < passarosPorDia.length; i++) {
            totalPassaros += passarosPorDia[i];
            if(i<7){
                passarosPrimeiraSemana += passarosPorDia[i];
            } else {
                passarosSegundaSemana += passarosPorDia[i];
            }

        }

        System.out.println("Passaros na semana 01: " + passarosPrimeiraSemana + " e passaros na semana 02: " + passarosSegundaSemana + " e o total de passaros e: " + totalPassaros);
    }
}
