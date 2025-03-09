package entidades;

import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

// Pode ter atributo Departamento futuramente!

public class Professor {
    private final Random MATRICULA = new Random(1000);
    private String nome;
    private String email;
    private Date nascimento;

    private Set<Materia> materias = new HashSet<>();

    public Professor() {
    }

    public Professor(String nome, String email, Date nascimento, Set<Materia> materias) {
        this.nome = nome;
        this.email = email;
        this.nascimento = nascimento;
        this.materias = materias;
    }

    public Random getMatricula() {
        return MATRICULA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Set<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(Set<Materia> materias) {
        this.materias = materias;
    }

    public void vincularEmMateria(Materia materia) {
        materias.add(materia);
    }

    public void desvincularDeMateria(Materia materia) {
        materias.remove(materia);
    }
}
