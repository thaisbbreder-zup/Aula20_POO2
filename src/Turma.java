import java.util.Scanner;

public class Turma {
    public String codigo;
    public String disciplina;
    public String sala;

    public Turma(String codigo, String disciplina, String sala) {

        this.codigo = codigo;
        this.disciplina = disciplina;
        this.sala = sala;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public String getSala() {
        return sala;
    }

    public static Turma criarTurma(Scanner entradaDoUsuario) {
        System.out.print("Digite o código da nova turma: ");
        String codigoTurma = entradaDoUsuario.next();
        System.out.print("Digite a disciplina da nova turma: ");
        String disciplinaTurma = entradaDoUsuario.next();
        System.out.print("Digite a sala da nova turma: ");
        String salaTurma = entradaDoUsuario.next();

        return new Turma(codigoTurma, disciplinaTurma, salaTurma);
    }
}