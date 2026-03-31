import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LoginMenu {
    public static void LoginMenu() {
        System.out.println("WELCOME TO OUR TRANSPORTATION APP");
        System.out.println("1. Sign in");
        System.out.println("2. Create account");
        System.out.println("3. Forgot password");
        Scanner scanner = new Scanner(System.in);
        try {
            File file = new File("UserAccounts.txt");
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
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
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
    public static void signIn (){
//        Scanner scanner = new Scanner(System.in);
//        try{
//        //BufferedReader reader = new BufferedReader(new FileReader("UserAccounts.txt"));
////                    String line;
////                    while((line = reader.readLine()) != null) {
////                        System.out.println(line);
////                    }
////                    reader.close();
//    } catch (IOException e) {
//        System.out.println("An error occurred while creating the file.");
//        e.printStackTrace();
//    } finally {
//        scanner.close();
//    }
    };
    public static void CreateAccount (){
        Scanner scanner = new Scanner(System.in);
        try{
        FileWriter writer = new FileWriter("UserAccounts.txt");
        System.out.println("ENTER YOUR USERNAME");
        String userName = scanner.nextLine();
        System.out.println("ENTER YOUR Password");
        String Password = scanner.nextLine();
        writer.write(userName + "" + Password);

        writer.close();

    } catch (IOException e) {
        System.out.println("An error occurred while creating the file.");
        e.printStackTrace();
    } finally {
        scanner.close();
    }
    };
}
