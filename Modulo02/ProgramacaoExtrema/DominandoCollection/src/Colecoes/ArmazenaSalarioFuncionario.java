package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class ArmazenaSalarioFuncionario {
    public static void main(String[] args) {
        Map<String, Integer> funcSal = new HashMap<>(10, 0.5f); //Inicializa com 10 elementos e fator de carga 0.5

        // Adicionando os funcionários
        funcSal.put("Rita", 10000);
        funcSal.put("João", 20000);
        funcSal.put("Maria", 30000);
        funcSal.put("Joaquim", 40000);
        funcSal.put("Manuel", 50000);


        funcSal.put(null, null); //Insere uma chave e um valor nulo

        System.out.println("Original Map: " + funcSal); // Exibe o Map original

        funcSal.put("Rita", 15000); //Atualiza o valor da chave "Rita"
        funcSal.put("Renato", 60000); //Adiciona um novo par chave-valor
        funcSal.remove("João"); //Remove o par chave-valor com a chave "João"

        System.out.println("Updated Map: " + funcSal);

        System.out.println(funcSal.keySet()); //Exibe todas as chaves do Map
        System.out.println(funcSal.values()); //Exibe todos os valores do Map


    }
}

// HashMap armazena os para chave-vaçpr sem garantir uma ordem específica.
