import java.util.ArrayList;

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

    public ArrayList<Estagiarios> getEstagiariosSupervisionados() {
        return estagiariosSupervisionados;
    }

 

    public void exibirInformacoes(int cargo) {
               System.out.println("\nInformações do Professor:\n");

        super.exibirInformacoes(cargo);
        System.out.println("Nível de Graduação: " +  getNivelGraduacao());
        System.out.println("Disciplina: " +  getDisciplina());
        System.out.println("Quantidade de Alunos: " + getQntAlunos());
        System.out.println("Quantidade de Turmas: " + getQntTurmas());
        System.out.print("Estagiarios Supervisionados: ");
        for (Estagiarios estagiario : getEstagiariosSupervisionados()) {
            System.out.print(estagiario.getNome() + " | ");
        }
        System.out.println();


    }


}

