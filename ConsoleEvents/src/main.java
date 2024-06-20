import java.util.Scanner;


public class main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);


        System.out.println("==================================================================|");
        System.out.println("Bem vindo ao Software de Eventos de Canoas e região metropolitana!|");
        System.out.println("             Para prosseguir precisa de login                     |");
        System.out.println("         1- para login      ||      0 - Registro de usuario       |");
        System.out.print(" Digite sua escolha: ");
        int OneOrZero = sc.nextInt();



            if(1==OneOrZero) {
                System.out.println("Deu errado");

            } else {
                RegistrarUsuario registrar = new RegistrarUsuario();
                Usuario novoUsuario = registrar.capturarDadosUsuario();

            }

        System.out.println("\n==================================================================");

            // Seria o codigo dar clean up no console


    }
}
