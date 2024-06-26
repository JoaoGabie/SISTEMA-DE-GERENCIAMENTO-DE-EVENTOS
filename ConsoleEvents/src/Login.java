import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    private static final String FILE_PATH = "Data/DataUsuario.txt";
    private static String username;
    private static String password;

    public static void methodLogin() {
        CleanConsole.clean();
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=- Login =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
        System.out.println("       Digite 'voltar' para retornar ao menu principal");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite 'voltar' para retornar ao menu principal");
            System.out.print("Emai: ");
            username = scanner.nextLine();
            if (username.equalsIgnoreCase("voltar")) {
                return;  // Voltar ao menu principal
            }

            System.out.print("Senha: ");
            password = scanner.nextLine();
            if (password.equalsIgnoreCase("voltar")) {
                return;  // Voltar ao menu principal
            }

            if (validLogin()) {
                System.out.println("Login bem-sucedido!");
                CleanConsole.clean();
                return;  // Sucesso, voltando ao menu principal
            } else {
                System.out.println("\nUsuário ou senha inválidos. Tente novamente.\n");
            }
        }
    }


    public static boolean validLogin() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[2].equals(username) && parts[3].equals(password)) {
                    CleanConsole.clean();
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler os dados do usuário.");
            e.printStackTrace();
        }

        return false;
    }
}
