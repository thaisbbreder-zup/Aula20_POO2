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

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public int getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentoSalario(int cargo) {
        if (cargo != 1) {
            salario *= 1.1; // Aumento de 10%
        } else {
            salario *= 1.05;
        }
    }

    public void exibirInformacoes(int cargo) {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Número de Registro: " + getNumRegistro());
        System.out.println("Orgão de Lotação: " + getOrgaoLotacao());
        System.out.println("Salário antes do aumento: " +  getSalario());
         aumentoSalario(cargo);
        System.out.println("Salário após o aumento: " +  getSalario());
    }

}