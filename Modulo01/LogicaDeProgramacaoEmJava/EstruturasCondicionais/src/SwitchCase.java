import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("Cadastrar aluno: Opção - 1");
        System.out.println("Cadastrar professor: Opção - 2");
        System.out.println("Cadastrar disciplina: Opção - 3");
        System.out.println("Cadastrar turma: Opção - 4");
        System.out.println("Sair: Opção - 5");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Cadastrando Aluno");
                break;
            case 2:
                System.out.println("Cadastrando Professor");
                break;
            case 3:
                System.out.println("Cadastrando Disciplina");
                break;
            case 4:
                System.out.println("Cadastrando Turma");
                break;
            case 5:
                System.out.println("Saindo");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
