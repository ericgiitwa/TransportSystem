import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class LoginMenu {
    public static void Menu() {
        System.out.println("WELCOME TO OUR TRANSPORTATION APP");
        System.out.println("1. Sign in");
        System.out.println("2. Create account");
        System.out.println("3. Forgot password");
        Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            switch (choice) {
                case "1": //sign in...get file information//use for password validation
                    signIn ();
                    break;

                case "2": //create account...write the files
                    CreateAccount ();
                    break;
                case "3": //forgot password append the password
//                    FileWriter writer = new FileWriter("UserAccounts.txt", true);
//                    writer.write("New Student\n");
//                    writer.close();
                    break;

            }
    }


    public static void signIn() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER USERNAME:");
        String inputUsername = scanner.nextLine();

        System.out.println("ENTER PASSWORD:");
        String inputPassword = scanner.nextLine();

        boolean found = false;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("UserAccounts.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                String savedUsername = data[0];
                String savedPassword = data[1];

                if (savedUsername.equals(inputUsername) && savedPassword.equals(inputPassword)) {
                    System.out.println("Login successful!");
                    found = true;
                    break;
                }
            }

            reader.close();

            if (!found) {
                System.out.println("Invalid username or password.");
            }

        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }

    public static void CreateAccount (){
        Scanner scanner = new Scanner(System.in);
        try{
        FileWriter writer = new FileWriter("UserAccounts.txt",true);
        System.out.println("ENTER YOUR USERNAME");
        String userName = scanner.nextLine();
        System.out.println("ENTER YOUR Password");
        String Password = scanner.nextLine();
        System.out.println("ENTER YOUR Phone Number");
        String PhoneNumber = scanner.nextLine();
        System.out.println("ENTER YOUR Age");
        String Age = scanner.nextLine();
            System.out.println("Are you a Driver or Passanger?");
            String UserType = scanner.nextLine();
        writer.write(userName + "," + Password+ "," +PhoneNumber+ "," +Age+ "," + UserType);

        writer.close();

    } catch (IOException e) {
        System.out.println("An error occurred while creating the file.");
        e.printStackTrace();
    } finally {
        scanner.close();
    }
    };
}
