public class Contato {
    private String nome;
    private String email;
    private String numeroTelefone;

    public Contato() {
    }

    public Contato(String nome, String email, String numeroTelefone) {
        this.nome = nome;
        this.email = email;
        this.numeroTelefone = numeroTelefone;
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

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", numeroTelefone='" + numeroTelefone + '\'' +
                '}';
    }
}
