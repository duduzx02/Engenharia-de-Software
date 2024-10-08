package Conceitos;

public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome + "\nCPF: " + cpf);
    }
}

class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public void exibirDados(){
        super.exibirDados();
        System.out.println("Matricula: " + matricula);
    }
}

class Main2{
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Eduardo Lima", "123.456.789-00", "123456");
        aluno.exibirDados();
    }
}
