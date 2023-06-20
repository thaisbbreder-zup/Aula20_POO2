import java.util.ArrayList;
import java.util.Scanner;

public class Professores extends Funcionarios {

    public String nivelGraduacao;
    public String disciplina;
    public int qntAlunos;
    public int qntTurmas;
    public Turma turma; //atributo de composicao
    public ArrayList<Estagiarios> estagiariosSupervisionados;
    public int qntEstagiariosSupervisionados = 2;

    public Professores(String nome, int cpf, int numRegistro, int orgaoLotacao, double salario, String nivelGraduacao, String disciplina, int qntAlunos, int qntTurmas) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplina = disciplina;
        this.qntAlunos = qntAlunos;
        this.qntTurmas = qntTurmas;
        this.turma = turma;
        this.estagiariosSupervisionados = new ArrayList<>();
    }

    public Professores(String nomeProfessor, int cpfProfessor, int numRegistroProfessor, int orgaoLotacaoProfessor, double salarioProfessor) {
        super(nomeProfessor, cpfProfessor, numRegistroProfessor, orgaoLotacaoProfessor, salarioProfessor);
    }


    public void adicionaTurma() {
        qntTurmas++;
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public int getQntAlunos() {
        return qntAlunos;
    }

    public int getQntTurmas() {
        return qntTurmas;
    }

    public void adicionaEstagiarios(Estagiarios estagiario) {
        if (estagiariosSupervisionados.size() < 2) {
            estagiariosSupervisionados.add(estagiario);
        } else {
            System.out.println("Limite máximo de estagiários supervisionados atingido!");
        }

    }

    public void adicionaTurma(Turma turma) {
        this.turma = turma;
    }

    public ArrayList<Estagiarios> getEstagiariosSupervisionados() {
        return estagiariosSupervisionados;
    }

    public void exibirInformacoes(int cargo, double valorDespesa) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("\nInformações do Professor:\n");

        super.exibirInformacoes(cargo, valorDespesa);
        System.out.println("Nível de Graduação: " + getNivelGraduacao());
        System.out.println("Disciplina: " + getDisciplina());
        System.out.println("Quantidade de Alunos: " + getQntAlunos());
        System.out.println("Quantidade de Turmas: " + getQntTurmas());
        System.out.print("Estagiarios Supervisionados: ");
        for (Estagiarios estagiario : getEstagiariosSupervisionados()) {
            System.out.print(estagiario.getNome() + " | ");
        }
        System.out.println();

        System.out.println("\nGostaria de adicionar um novo estágiario para ser supervisionado? \n1 - SIM \n2 - NÃO");
        String addEstagiario = entradaDoUsuario.next();
        if (addEstagiario.equals("1") && getEstagiariosSupervisionados().size() <= 1) {
            System.out.print("Digite o primeiro nome do novo estagiario(a): ");
            String nomeEstagiario = entradaDoUsuario.next();
            System.out.print("Digite o CPF do novo estagiario(a): ");
            int cpfEstagiario = entradaDoUsuario.nextInt();
            System.out.print("Digite o número de registro do novo estagiario(a): ");
            int numRegistroEstagiario = entradaDoUsuario.nextInt();
            System.out.print("Digite o orgão de lotação do novo estagiario(a): ");
            int orgaoLotacaoEstagiario = entradaDoUsuario.nextInt();
            System.out.print("Digite o salário do novo estagiario(a): ");
            double salarioEstagiario = entradaDoUsuario.nextDouble();
            System.out.print("Digite o nível ou curso de graduação do novo estagiario(a): ");
            String nivelGraduacaoEstagiario = entradaDoUsuario.next();
            System.out.print("Digite a disciplina que o novo estagiario(a) será responsável: ");
            String disciplinaEstagiario = entradaDoUsuario.next();

            Estagiarios novoEstagiario = new Estagiarios(nomeEstagiario, cpfEstagiario, numRegistroEstagiario, orgaoLotacaoEstagiario, salarioEstagiario, nivelGraduacaoEstagiario, disciplinaEstagiario);
            adicionaEstagiarios(novoEstagiario);

            System.out.println("Estagiário(a) adicionado com sucesso!");

            System.out.print("Estagiários Supervisionados: ");
            for (Estagiarios estagiario : getEstagiariosSupervisionados()) {
                System.out.print(estagiario.getNome() + " | ");
            }
            System.out.println();
        } else {
            System.out.println("OK! Nenhuma alteração foi feita.");
        }
    }
}

