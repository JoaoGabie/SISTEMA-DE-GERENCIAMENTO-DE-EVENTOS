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

        // Presumindo que outras informações são necessárias para criar um Usuario

        System.out.print("Digite a senha do usuário: ");
        String password = scanner.nextLine();

        System.out.print("Digite a cidade do usuário: ");
        String cidade = scanner.nextLine();

        return new Usuario(nome, sobrenome, email, password, cidade);
    }
}