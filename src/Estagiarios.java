public class Estagiarios extends Professores {
    public Estagiarios(String nome, int cpf, int numRegistro, int orgaoLotacao, double salario, String nivelGraduacao, String disciplina) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario, nivelGraduacao, disciplina, 0, 0);
    }

    @Override
    public void aumentoSalario() {
        setSalario(getSalario() * 1.1);
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public int getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(int orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }
}

