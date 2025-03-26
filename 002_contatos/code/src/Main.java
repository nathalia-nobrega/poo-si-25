import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Contato[] contatos = new Contato[5];

        System.out.println("\t\t\t----------------- CADASTRO DE 5 CONTATOS -----------------");
        for (int i = 0; i < contatos.length; i++) {
            System.out.println("Contato nº " + (i + 1));
            System.out.print("Nome: ");
            String nome = in.next();
            System.out.print("E-mail: ");
            String email = in.next();
            System.out.print("Número de telefone: ");
            String numeroTelefone = in.next();
            Contato contato = new Contato(nome, email, numeroTelefone);
            contatos[i] = contato;
        }
        in.close();
    }
}