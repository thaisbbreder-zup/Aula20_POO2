public class Estagiarios extends Professores {
    public Estagiarios(String nome, int cpf, int numRegistro, int orgaoLotacao, double salario, String nivelGraduacao, String disciplina) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario, nivelGraduacao, disciplina, 0, 0);
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


