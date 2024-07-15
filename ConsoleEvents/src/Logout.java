import java.util.Scanner;

public class Logout {
    public static void methodLogout(){

        Scanner sc = new Scanner(System.in);
        int ChooseOption = -1;

        while (ChooseOption != 0) {

            CleanConsole.clean();
            System.out.println("1- Logout || 2 - sair do programa || 0 - Voltar");
            System.out.print("Digite sua escolha: ");

            try {
                ChooseOption = sc.nextInt();
                sc.nextLine();

                switch (ChooseOption) {
                    case 1:
                        Menu.displayMenu();
                        break;
                    case 2:
                        System.out.println("\n==================================================================");
                        System.out.println("\n                  O programa será encerrado.");
                        System.out.println("\n==================================================================");
                        System.exit(0);
                        break;
                    case 0:
                        Menu2.displayMenu2();
                        break;
                    default:
                        System.out.println("Opção invalida. Tente novamente.");

                }
            } catch (Exception e) {
                System.out.println("Erro ao ler entrada. Certifique-se de digitar um número válido.");
            }
        }

    }
}
