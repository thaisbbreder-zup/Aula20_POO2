public class Administrativos extends Funcionarios {

    public final String senioridade;
    public String funcaoAdm;


    public Administrativos(String nome, int cpf, int numRegistro, int orgaoLotacao, double salario, String funcaoAdm, String senioridade) {

        super(nome, cpf, numRegistro, orgaoLotacao, salario);

        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade;
    }


    @Override
    public void aumentoSalario() {
        setSalario(getSalario() * 1.1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getFuncaoAdm() {
        return funcaoAdm;
    }

    public void setFuncaoAdm(String funcaoAdm) {
        this.funcaoAdm = funcaoAdm;
    }
}
