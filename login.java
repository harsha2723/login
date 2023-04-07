import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username = "example";
        String password = "password";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if (username.equals(inputUsername) && password.equals(inputPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
