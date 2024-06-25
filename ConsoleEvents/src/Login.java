import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Login {
    private static final String FILE_PATH = "Data/DataUsuario.txt";
    public static boolean login(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
                try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] parts = line.split(":");
                        if (parts[0].equals(username) && parts[1].equals(password)) {
                            System.out.println("Login successful!");
                            return true;
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Error reading user data.");
                    e.printStackTrace();
                }

                System.out.println("Invalid username or password.");
                return false;
    }
}