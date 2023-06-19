import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);
        System.out.println("\n------------------------------------------------------------------------------");
        System.out.println("------------------------ INFORMAÇÕES DOS FUNCIONÁRIOS ------------------------");

        System.out.println("\nDigite o número do cargo do funcionário: \n1 - Coordenador \n2 - Professor \n3 - Administrativo \n4 - Estagiário");
        int cargo = entradaDoUsuario.nextInt();

        switch (cargo) {
            case 1:
                Coordenadores coordenador1 = new Coordenadores("Maria Amélia De Carvalho", 987654321, 3, 2, 3000.0);
                Professores professor1 = new Professores("Andréia Pires", 123456789, 1, 2, 2000.0, "Graduação", "Matemática", 30, 3);
                 coordenador1.adicionaProfessor(professor1);

                System.out.println("\nInformações do Coordenador:\n");
                System.out.println("Nome: " + coordenador1.getNome());
                System.out.println("CPF: " + coordenador1.getCpf());
                System.out.println("Número de Registro: " + coordenador1.getNumRegistro());
                System.out.println("Orgão de Lotação: " + coordenador1.getOrgaoLotacao());
                System.out.print("Professores Supervisionados: ");
                for (Professores professor : coordenador1.getProfSupervisionados()) {
                    System.out.print(professor.getNome() + " | ");
                }
                System.out.println();
                System.out.println("Salário antes do aumento: " + coordenador1.getSalario());
                coordenador1.aumentoSalario();
                System.out.println("Salário após o aumento: " + coordenador1.getSalario());

                System.out.println("\nGostaria de adicionar um novo professor para ser supervisionado? \n1 - SIM \n2 - NÃO");
                String addProf = entradaDoUsuario.next();

                if (addProf.equals("1") && coordenador1.getProfSupervisionados().size() <= 1){
                    System.out.print("Digite o nome do professor(a): ");
                    String nomeProfessor = entradaDoUsuario.next();
                    System.out.print("Digite o CPF do professor(a): ");
                    int cpfProfessor = entradaDoUsuario.nextInt();
                    System.out.print("Digite o número de registro do professor(a): ");
                    int numRegistroProfessor = entradaDoUsuario.nextInt();
                    System.out.print("Digite o orgão de lotação do professor(a): ");
                    int orgaoLotacaoProfessor = entradaDoUsuario.nextInt();
                    System.out.print("Digite o salário do professor(a): ");
                    double salarioProfessor = entradaDoUsuario.nextDouble();

                    Professores novoProfessor = new Professores(nomeProfessor, cpfProfessor, numRegistroProfessor, orgaoLotacaoProfessor, salarioProfessor);
                    coordenador1.adicionaProfessor(novoProfessor);

                    System.out.println("Professor(a) adicionado com sucesso!");

                    System.out.print("Professores Supervisionados: ");
                    for (Professores professor : coordenador1.getProfSupervisionados()) {
                        System.out.print(professor.getNome() + " | ");
                    }
                    System.out.println();
                }else{
                    System.out.println("ERRO: Limite máximo de professores supervisionados atingido!");
                }
                break;

            case 2:
                Professores professor2 = new Professores("Marcela Queiroz Silva", 111222333, 3, 5, 2700, "Mestrado", "Matematica", 10, 5);
                Estagiarios estagiario2 = new Estagiarios("Maria Fernanda Rodrigues", 111222333, 5, 1, 500, "Graduação", "Estágio");
                professor2.adicionaEstagiario(estagiario2);

                System.out.println("\nInformações do Professor:\n");
                System.out.println("Nome: " + professor2.nome);
                System.out.println("CPF: " + professor2.cpf);
                System.out.println("Número de Registro: " + professor2.numRegistro);
                System.out.println("Orgão de Lotação: " + professor2.orgaoLotacao);
                System.out.println("Nível de Graduação: " + professor2.getNivelGraduacao());
                System.out.println("Disciplina: " + professor2.getDisciplina());
                System.out.println("Quantidade de Alunos: " + professor2.getQntAlunos());
                System.out.println("Quantidade de Turmas: " + professor2.getQntTurmas());
                System.out.print("Estagiarios Supervisionados: ");
                for (Estagiarios estagiario : professor2.getEstagiariosSupervisionados()) {
                    System.out.print(estagiario.getNome() + " | ");
                }
                System.out.println();
                System.out.println("Salário antes do aumento: " + professor2.getSalario());
                professor2.aumentoSalario();
                System.out.println("Salário após o aumento: " + professor2.getSalario());
                break;

            case 3:
                Administrativos administrativo1 = new Administrativos("Maria Julia Muzzi", 161272344, 5, 1, 1500, "Assistente Administrativo", "Pleno");
                System.out.println("\nInformações do Setor Administrativo:\n");
                System.out.println("Nome: " + administrativo1.getNome());
                System.out.println("CPF: " + administrativo1.getCpf());
                System.out.println("Número de Registro: " + administrativo1.getNumRegistro());
                System.out.println("Orgão de Lotação: " + administrativo1.getOrgaoLotacao());
                System.out.println("Função: " + administrativo1.getFuncaoAdm());
                System.out.println("Salário antes do aumento: " + administrativo1.getSalario());
                administrativo1.aumentoSalario();
                System.out.println("Salário após o aumento: " + administrativo1.getSalario());
                break;

            case 4:
                Estagiarios estagiario1 = new Estagiarios("José Fernandes Rodrigues", 111222333, 3, 1, 500, "Graduação", "Estágio");
                System.out.println("\nInformações do Estagiário:\n");
                System.out.println("Nome: " + estagiario1.getNome());
                System.out.println("CPF: " + estagiario1.getCpf());
                System.out.println("Número de Registro: " + estagiario1.getNumRegistro());
                System.out.println("Orgão de Lotação: " + estagiario1.getOrgaoLotacao());
                System.out.println("Nível de Graduação: " + estagiario1.getNivelGraduacao());
                System.out.println("Bolsa antes do aumento: " + estagiario1.getSalario());
                estagiario1.aumentoSalario();
                System.out.println("Bolsa após o aumento: " + estagiario1.getSalario());
        }
    }
}

