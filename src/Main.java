import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("\n------------------------------------------------------------------------------");
        System.out.println("------------------------ INFORMAÇÕES DOS FUNCIONÁRIOS ------------------------");

        System.out.println("\nDigite o número do cargo do funcionário: \n1 - Coordenador \n2 - Professor \n3 - Administrativo \n4 - Estagiário");
        int cargo = entradaDoUsuario.nextInt();

        System.out.print("\nInforme o valor da despesa do mensal: ");
        double valorDespesa = entradaDoUsuario.nextDouble();

        switch (cargo) {
            case 1:
                Coordenadores coordenador1 = new Coordenadores("Maria Amélia De Carvalho", 987654321, 3, 2, 3000.0);
                Professores professor1 = new Professores("Andréia Pires", 123456789, 1, 2, 2000.0, "Graduação", "Matemática", 30, 3);
                coordenador1.adicionaProfessor(professor1);
                coordenador1.exibirInformacoes(cargo, valorDespesa);
                break;

            case 2:
                Professores professor2 = new Professores("Marcela Queiroz Silva", 111222333, 3, 5, 2700, "Mestrado", "Matematica", 10, 5);
                Estagiarios estagiario1 = new Estagiarios("José Fernandes", 444555666, 4, 2, 600, "Graduação", "Estágio");
                professor2.adicionaEstagiarios(estagiario1);
                Turma turma1 = new Turma("T1", "Matemática", "Sala A");
                professor2.adicionaTurma(turma1);
                professor2.exibirInformacoes(cargo, valorDespesa);

               System.out.print("Deseja adicionar mais uma turma para o professor? (1 - SIM, 2 - NÃO): ");
                int opcao = entradaDoUsuario.nextInt();
                if (opcao == 1) {
                    Turma novaTurma = Turma.criarTurma(entradaDoUsuario);
                    professor2.adicionaTurma(novaTurma);
                }
                break;

            case 3:
                Administrativos administrativo1 = new Administrativos("Maria Julia Muzzi", 161272344, 5, 1, 1500, "Assistente Administrativo", "Pleno");
                administrativo1.exibirInformacoes(cargo, valorDespesa);
                break;

            case 4:
                Estagiarios estagiario2 = new Estagiarios("José Fernandes Rodrigues", 111222333, 3, 1, 500, "Graduação", "Estágio");
                estagiario2.exibirInformacoes(cargo, valorDespesa);
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }

}

