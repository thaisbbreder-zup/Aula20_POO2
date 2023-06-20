public class Estagiarios extends Professores {

    public String nivelGraduacao;
    public String disciplina;
    public Estagiarios(String nome, int cpf, int numRegistro, int orgaoLotacao, double salario, String nivelGraduacao, String disciplina) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplina = disciplina;
    }

    public void exibirInformacoes(int cargo) {
        System.out.println("\nInformações do Estagiário:\n");
        super.exibirInformacoes(cargo);
        System.out.println("Nível de Graduação: " + getNivelGraduacao());
        System.out.println("Bolsa antes do aumento: " + getSalario());
        aumentoSalario(cargo);
        System.out.println("Bolsa após o aumento: " + getSalario());
    }
}


