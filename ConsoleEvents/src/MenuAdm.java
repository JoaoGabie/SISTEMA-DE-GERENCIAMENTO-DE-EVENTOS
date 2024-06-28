import java.util.Scanner;
import java.util.InputMismatchException;

public class MenuAdm {
    public static void methodMenuAdm(){
        Scanner sc = new Scanner(System.in);
        int ChooseOption = -1;

                while(ChooseOption != 0){

                    CleanConsole.clean();
                    System.out.println("|==========Administração==========|");
                    System.out.println("| ----------- Eventos ----------- |");
                    System.out.println("| 1-  Cadastro  de eventos        |");
                    System.out.println("| 2 - Visualização de Eventos     |");
                    System.out.println("| 3 - Cancelar algum evento       |");
                    System.out.println("| ----------- Usuario ----------- |");
                    System.out.println("| 4 - Cadastro de um novo usuario |");
                    System.out.println("| 5 - Exclusão de um Usuario      |");
                    System.out.println("|----------- 0 - voltar ----------|");
                    System.out.println("|=================================|");
                    System.out.print("Digite sua escolha: ");

                    try {
                        ChooseOption = sc.nextInt();
                        sc.nextLine();

                        switch (ChooseOption) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                RegistrarUsuario registrar = new RegistrarUsuario();
                                Usuario novoUsuario = registrar.capturarDadosUsuario();
                                registrar.salvarUsuarioEmArquivo(novoUsuario);
                                break;
                            case 5:
                                System.out.print("Email do usuário a ser excluído: ");
                                String email = sc.nextLine();
                                Login.deleteUser(email);
                                System.out.println("Voltando ao menu principal...");
                                break;
                            case 0:
                                Menu2 menu2 = new Menu2();
                                menu2.displayMenu2();
                            default:
                                System.out.println("Opção invalida. Tente novamente.");
                        }
                    }
                        catch (InputMismatchException e) {
                            System.out.println("Erro ao ler entrada. Certifique-se de digitar um número válido.");
                            e.printStackTrace();
                        }
           sc.close();
                }
}
}