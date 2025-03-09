package entidades;

import java.util.HashSet;
import java.util.Set;

/**
 * Curso pode:
 * 1. Cadastrar/remover uma matéria em seu currículo
 * 2. Consultar a lista de professores vinculados
 * 3. Vincular/desvincular professores de matérias
 * 4. Designar um coordenador
 */

public class Curso {

    // Atributos básicos
    private String nome;
    private String descricao;
    private int duracaoSemestres;
    private int cargaHoraria;

    // Atributos que possuem relacionamentos
    private Professor professorCoordenador;
    private Set<Materia> materias = new HashSet<>();
    private Set<Professor> professores = new HashSet<>();

    public Curso() {
    }

    public Curso(String nome, String descricao, int duracaoSemestres, int cargaHoraria, Professor professorCoordenador, Set<Materia> materias, Set<Professor> professores) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracaoSemestres = duracaoSemestres;
        this.cargaHoraria = cargaHoraria;
        this.professorCoordenador = professorCoordenador;
        this.materias = materias;
        this.professores = professores;
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

    public int getDuracaoSemestres() {
        return duracaoSemestres;
    }

    private void setDuracaoSemestres(int duracaoSemestres) {
        this.duracaoSemestres = duracaoSemestres;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    private void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessorCoordenador() {
        return professorCoordenador;
    }

    private void setProfessorCoordenador(Professor professorCoordenador) {
        this.professorCoordenador = professorCoordenador;
    }

    public Set<Materia> getMaterias() {
        return materias;
    }

    private void setMaterias(Set<Materia> materias) {
        this.materias = materias;
    }

    public Set<Professor> getProfessores() {
        return professores;
    }

    private void setProfessores(Set<Professor> professores) {
        this.professores = professores;
    }

    // Métodos criados

    private void designarCoordenador(Professor professorCoordenador) {
        setProfessorCoordenador(professorCoordenador);
        System.out.println("O professor " + professorCoordenador.getNome() + " foi designado(a) como Coordenador(a) do curso " + this.getNome());
    }

    protected void vincularProfessor(Professor professor) {
        this.professores.add(professor);
    }

    protected void desvincularProfessor(Professor professor) {
        this.professores.remove(professor);
    }

    public void vincularMateria(Materia materia) {
        this.materias.add(materia);
    }

    public void desvincularMateria(Materia materia) {
        desvincularProfessorMateria(materia.getProfessorResponsavel(), materia);
        this.materias.remove(materia);
    }

    public void vincularProfessorMateria(Professor professor, Materia materia) {
        professor.vincularEmMateria(materia);
        materia.designarProfessorResponsavel(professor);
    }

    public void desvincularProfessorMateria(Professor professor, Materia materia) {
        professor.desvincularDeMateria(materia);
        materia.desvincularProfessorResponsavel();
    }

}
