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

    @Override
    public void aumentoSalario() {
        setSalario(getSalario() * 1.1);
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Estagiarios> getEstagiariosSupervisionados() {
        return estagiariosSupervisionados;
    }

    public void adicionaEstagiario(Estagiarios estagiario) {
        if (estagiariosSupervisionados.size() < 2) {
            estagiariosSupervisionados.add(estagiario);
        } else {
            System.out.println("Limite máximo de professores supervisionados atingido!");
        }

    }
}

