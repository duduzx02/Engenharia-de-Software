package ConstrutoresESobrecarga;

public class Carro3 {

    private String modelo;
    private int ano;

    // Construtor padrao
    public Carro3(){
        modelo = "Modelo Padrao";
        ano = 2022;
    }

    // Construtor sobrecarregado
    public Carro3(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }


}
