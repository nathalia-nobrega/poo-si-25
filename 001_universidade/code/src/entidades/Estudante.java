package entidades;

import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Estudante {

    private final Random MATRICULA = new Random(1000);
    private String nome;
    private String email;
    private Date nascimento;

    private Set<Materia> materias = new HashSet<>();
    private Curso curso;

    public Estudante() {
    }

    public Estudante(String nome, String email, Date nascimento, Set<Materia> materias, Curso curso) {
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.materias = materias;
        this.curso = curso;
    }

    public Random getMatricula() {
        return MATRICULA;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public Date getNascimento() {
        return nascimento;
    }

    private void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Set<Materia> getMaterias() {
        return materias;
    }

    private void setMaterias(Set<Materia> materias) {
        this.materias = materias;
    }

    public Curso getCurso() {
        return curso;
    }

    private void setCurso(Curso curso) {
        this.curso = curso;
    }

    // Métodos criados

    public void matricularEmCurso(Curso curso) {
        this.setCurso(curso);
    }

    public void trancarCurso(Curso curso) {
        this.setCurso(null);
    }

    public void matricularEmMateria(Materia materia) {
        this.getMaterias().add(materia);
    }

    public void desmatricularDeMateria(Materia materia) {
        this.getMaterias().remove(materia);
    }
}
