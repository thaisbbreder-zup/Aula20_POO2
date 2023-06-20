import java.util.ArrayList;
import java.util.Scanner;

public class Coordenadores extends Funcionarios {
    public ArrayList<Professores> profsSupervisionados;
    public int qntProfsSupervisionados = 2;

    public Coordenadores(String nome, int cpf, int numRegistro, int orgaoLotacao, double salario) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
        this.profsSupervisionados = new ArrayList<>();
    }

    public void adicionaProfessor(Professores professor) {
        if (profsSupervisionados.size() < 2) {
            profsSupervisionados.add(professor);
        } else {
            System.out.println("Limite máximo de professores supervisionados atingido!");
        }

    }

    public ArrayList<Professores> getProfSupervisionados() {
        return profsSupervisionados;
    }

    public void exibirInformacoes(int cargo, double valorDespesa) {
        Scanner entradaDoUsuario = new Scanner(System.in);



        System.out.println("\nInformações do Coordenador:\n");
        super.exibirInformacoes(cargo, valorDespesa);
        System.out.print("Professores Supervisionados: ");
        for (Professores professor : getProfSupervisionados()) {
            System.out.print(professor.getNome() + " | ");
        }
        System.out.println();


        System.out.println("\nGostaria de adicionar um novo professor para ser supervisionado? \n1 - SIM \n2 - NÃO");
        String addProf = entradaDoUsuario.next();

        if (addProf.equals("1") && getProfSupervisionados().size() <= 1) {
            System.out.print("Digite o nome do professor(a): ");
            String nomeProfessor = entradaDoUsuario.next();
            System.out.print("Digite o CPF do professor(a): ");
            int cpfProfessor = entradaDoUsuario.nextInt();
            System.out.print("Digite o número de registro do professor(a): ");
            int numRegistroProfessor = entradaDoUsuario.nextInt();
            System.out.print("Digite o orgão de lotação do professor(a): ");
            int orgaoLotacaoProfessor = entradaDoUsuario.nextInt();
            System.out.print("Digite o salário do professor(a): ");
            double salarioProfessor = entradaDoUsuario.nextDouble();

            Professores novoProfessor = new Professores(nomeProfessor, cpfProfessor, numRegistroProfessor, orgaoLotacaoProfessor, salarioProfessor);
            adicionaProfessor(novoProfessor);

            System.out.println("Professor(a) adicionado com sucesso!");

            System.out.print("Professores Supervisionados: ");
            for (Professores professor : getProfSupervisionados()) {
                System.out.print(professor.getNome() + " | ");
            }
            System.out.println();
        } else {
            System.out.println("ERRO: Limite máximo de professores supervisionados atingido!");
        }
    }
}
