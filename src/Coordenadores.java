import java.util.ArrayList;

public class Coordenadores extends Funcionarios {
    public ArrayList<Professores> profsSupervisionados;
    public int qntProfsSupervisionados = 2;

    public Coordenadores(String nome, int cpf, int numRegistro, int orgaoLotacao, double salario) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
        this.profsSupervisionados = new ArrayList<>();
    }


    @Override
    public void aumentoSalario() {
        setSalario(getSalario() * 1.05);
    }

    public void adicionaProfessor(Professores professor) {
        if (profsSupervisionados.size() < 2) {
            profsSupervisionados.add(professor);
        } else {
            System.out.println("Limite máximo de professores supervisionados atingido!");
        }

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


    public int getNumRegistro() {
        return numRegistro;
    }


    public int getOrgaoLotacao() {
        return orgaoLotacao;
    }


    public ArrayList<Professores> getProfSupervisionados() {
        return profsSupervisionados;
    }


}
