import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class RegistrarUsuario {
    private Scanner scanner;

    public RegistrarUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public Usuario capturarDadosUsuario() {
        System.out.print("Digite o nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome do usuário: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite o email do usuário: ");
        String email = scanner.nextLine();

        System.out.print("Digite a senha do usuário: ");
        String password = scanner.nextLine();

        System.out.print("Digite a cidade do usuário: ");
        String cidade = scanner.nextLine();

        return new Usuario(nome, sobrenome, email, password, cidade);
    }
    public void salvarUsuarioEmArquivo(Usuario usuario) {
        String caminho = "Data/DataUsuario.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(caminho, true))) {
            writer.println(usuario.toFileStringUser());
            System.out.println("Usuário salvo com sucesso no arquivo " + caminho+"\n");
        } catch (IOException e) {
            System.err.println("Erro ao salvar usuário no arquivo " + caminho + ": " + e.getMessage());
        }
    }
}
