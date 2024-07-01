import java.util.Scanner;

public class Menu {

    public static void displayMenu(){
        Scanner sc = new Scanner(System.in);
        int ChooseOption = -1;

        CleanConsole.clean();
        while (ChooseOption != 0) {
            CleanConsole.clean();
            System.out.println("==================================================================|");
            System.out.println("Bem vindo ao Software de Eventos de Canoas e região metropolitana!|");
            System.out.println("             Para prosseguir precisa de login                     |");
            System.out.println(" 1- para login || 2 - Registro de usuario || 0 - Fechar programa  |");
            System.out.print(" Digite sua escolha: ");

            try {
                ChooseOption = sc.nextInt();
                sc.nextLine();

                switch (ChooseOption) {
                    case 1:
                        Login login = new Login();
                        Login.methodLogin();
                        break;
                    case 2:
                        RegistrarUsuario registrar = new RegistrarUsuario();
                        Usuario novoUsuario = registrar.capturarDadosUsuario();
                        registrar.salvarUsuarioEmArquivo(novoUsuario);
                        break;
                    case 0:
                        System.out.println("==================================================================");
                        System.out.println("\n                  O programa será encerrado.");
                        System.out.println("\n==================================================================");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção invalida. Tente novamente.");

                }
            } catch (Exception e) {
                System.out.println("Erro ao ler entrada. Certifique-se de digitar um número válido.");
                sc.next();
            }
        }
        sc.close();
    }

}
