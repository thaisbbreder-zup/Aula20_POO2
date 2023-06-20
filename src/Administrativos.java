public class Administrativos extends Funcionarios {

    public final String senioridade;
    public String funcaoAdm;

    public Administrativos(String nome, int cpf, int numRegistro, int orgaoLotacao, double salario, String funcaoAdm, String senioridade) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade;
    }

    public String getFuncaoAdm() {
        return funcaoAdm;
    }

    public void setFuncaoAdm(String funcaoAdm) {
        this.funcaoAdm = funcaoAdm;
    }

    public void exibirInformacoes(int cargo, double valorDespesa) {
        Administrativos administrativo1 = new Administrativos("Maria Julia Muzzi", 161272344, 5, 1, 1500, "Assistente Administrativo", "Pleno");
        System.out.println("\nInformações do Setor Administrativo:\n");
        super.exibirInformacoes(cargo, valorDespesa);
        System.out.println("Função: " + administrativo1.getFuncaoAdm());
        System.out.println("Salário antes do aumento: " + administrativo1.getSalario());
        administrativo1.aumentoSalario(cargo);
        System.out.println("Salário após o aumento: " + administrativo1.getSalario());
    }
}
