package entidades;

import javax.swing.text.html.Option;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Universidade pode:
 * 1. Cadastrar novos cursos
 * 2. Cadastrar novos professores
 * 3. Vincular/desvincular professores a cursos
 */

public class Universidade {

    // Atributos básicos
    private String nome;
    private String endereco;
    private String telefoneContato;
    private String CNPJ;

    // Atributos que possuem relacionamentos
    private Set<Curso> cursos = new HashSet<>();
    private Set<Professor> professores = new HashSet<>();

    // Construtores
    public Universidade() {
    }

    public Universidade(String nome, String endereco, String telefoneContato, String CNPJ, Set<Curso> cursos, Set<Professor> professores) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefoneContato = telefoneContato;
        this.CNPJ = CNPJ;
        this.cursos = cursos;
        this.professores = professores;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    private void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    private void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    private void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    // Utilizar este para alterar a toda a lista de cursos
    private void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }

    public Set<Professor> getProfessores() {
        return professores;
    }

    private void setProfessores(Set<Professor> professores) {
        this.professores = professores;
    }

    // Métodos criados

    public void cadastrarNovoProfessor(Professor professor) {
        this.professores.add(professor);
        System.out.println(professor.getNome() + " foi adicionado à lista de professores da Universidade " + this.nome);
    }

    public void cadastrarNovoCurso(Curso curso) {
        // Verificar se já não existe um curso de mesmo nome
        boolean existeCursoComNome = cursos.stream()
                .anyMatch(cursoExistente -> cursoExistente.getNome().equals(curso.getNome()));

        if (existeCursoComNome) {
            System.out.println("Já existe um curso com este nome.");
        }
        else {
            cursos.add(curso);
            System.out.println(curso.getNome() + " foi adicionado à lista de cursos da Universidade " + this.nome);
        }
    }

    // Utilizar este para vincular um professor a um curso
    public void vincularProfessorCurso(Professor professor, Curso curso) {
        Optional<Curso> cursoEncontradoOuNull = this.cursos.stream()
                .filter(cursoExistente -> cursoExistente.getNome().equals(curso.getNome()))
                .findFirst();

        Curso cursoEncontrado = cursoEncontradoOuNull.orElse(null);

        if (cursoEncontrado == null) {
            System.out.println("Não existe este curso na Universidade " + this.nome);
        }
        else {
            cursoEncontrado.vincularProfessor(professor);
            System.out.println(professor.getNome() + " foi vinculado ao curso " + curso.getNome());
        }
    }

    public void desvincularProfessorCurso(Professor professor, Curso curso) {
        Optional<Curso> cursoEncontradoOuNull = this.cursos.stream()
                .filter(cursoExistente -> cursoExistente.getNome().equals(curso.getNome()))
                .findFirst();

        Curso cursoEncontrado = cursoEncontradoOuNull.orElse(null);

        if (cursoEncontrado == null) {
            System.out.println("Não existe este curso na Universidade " + this.nome);
        }
        else {
            cursoEncontrado.desvincularProfessor(professor);
            System.out.println(professor.getNome() + " foi desvinculado do curso " + curso.getNome());
        }
    }
}
