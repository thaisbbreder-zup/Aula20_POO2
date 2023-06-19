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
}