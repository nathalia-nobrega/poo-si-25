package entidades;

import java.util.HashSet;
import java.util.Set;

public class Materia {

    private String nome;
    private String descricao;
    private int cargaHoraria;

    private Professor professorResponsavel;
    private Set<Estudante> estudantes = new HashSet<>();

    public Materia() {
    }

    public Materia(String nome, String descricao, int cargaHoraria, Professor professorResponsavel, Set<Estudante> estudantes) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.professorResponsavel = professorResponsavel;
        this.estudantes = estudantes;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    private void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    private void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public Set<Estudante> getEstudantes() {
        return estudantes;
    }

    private void setEstudantes(Set<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    // Métodos criados

    public void designarProfessorResponsavel(Professor professor) {
        this.setProfessorResponsavel(professor);
    }

    public void desvincularProfessorResponsavel() {
        this.setProfessorResponsavel(null);
    }

    public void matricularEstudante(Estudante estudante) {
        estudante.matricularEmMateria(this);
        this.estudantes.add(estudante);

    }

    public void desmatricularEstudante(Estudante estudante) {
        estudante.desmatricularDeMateria(this);
        this.estudantes.remove(estudante);
    }
}
