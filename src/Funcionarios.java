public class Funcionarios {

    public String nome;
    public int cpf;
    public int numRegistro;
    public int orgaoLotacao;

    public double salario;

    public Funcionarios(String nome, int cpf, int numRegistro, int orgaoLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numRegistro = numRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }

    public Funcionarios() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentoSalario() {
        salario *= 1.1; // Aumento de 10%
    }

}