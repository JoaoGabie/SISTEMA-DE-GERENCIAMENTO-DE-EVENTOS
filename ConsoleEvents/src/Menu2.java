import java.util.Scanner;
import  java.lang.Exception;
import java.util.InputMismatchException;



public class Menu2 {

    public static void displayMenu2(){
        Scanner sc = new Scanner(System.in);
        int ChooseOption = -1;


            while (ChooseOption != 0) {
                CleanConsole.clean();
                System.out.println("|=========================|");
                System.out.println("| 1-  Usuario             |");
                System.out.println("| 2 - Administração       |");
                System.out.println("| 0 - logout              |");
                System.out.println("|=========================|");
                System.out.print("Digite sua escolha: ");

//                if (sc.hasNextInt()) {
//                    ChooseOption = sc.nextInt();
//                } else {
////                    sc.next(); // consume the invalid input
//                    throw new InputMismatchException();
//                }

                try {
                    ChooseOption = sc.nextInt();
                    sc.nextLine();

                    switch (ChooseOption) {
                        case 1:
                            System.out.println("OK");
                            break;
                        case 2:
                            MenuAdm menuAdm = new MenuAdm();
                            MenuAdm.methodMenuAdm();
                            break;
                        case 0:
                            Logout.methodLogout();
                            break;
                        default:
                            System.out.println("Opção invalida. Tente novamente.");

                    }
                } catch (Exception e) {
                    System.out.println("Erro ao ler entrada. Certifique-se de digitar um número válido.");
                    sc.nextLine();
                    e.printStackTrace();

                }
            }
        sc.close();
    }
}

