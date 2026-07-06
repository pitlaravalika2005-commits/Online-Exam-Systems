import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user = new User(
                "admin",
                "1234",
                "Arman",
                "arman@gmail.com");

        Exam exam = new Exam();

        System.out.println("===== ONLINE EXAMINATION SYSTEM =====");

        System.out.print("Username : ");
        String username = sc.nextLine();

        System.out.print("Password : ");
        String password = sc.nextLine();

        if (!user.login(username, password)) {
            System.out.println("Invalid Login!");
            return;
        }

        System.out.println("\nLogin Successful!");

        int choice;

        do {

            System.out.println("\n===== MENU =====");

            System.out.println("1. View Profile");
            System.out.println("2. Update Profile");
            System.out.println("3. Change Password");
            System.out.println("4. Start Exam");
            System.out.println("5. Logout");

            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    user.displayProfile();
                    break;

                case 2:

                    System.out.print("Enter New Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter New Email : ");
                    String email = sc.nextLine();

                    user.updateProfile(name, email);

                    break;

                case 3:

                    System.out.print("Old Password : ");
                    String oldPass = sc.nextLine();

                    System.out.print("New Password : ");
                    String newPass = sc.nextLine();

                    user.changePassword(oldPass, newPass);

                    break;

                case 4:

                    exam.startExam();

                    break;

                case 5:

                    System.out.println("Logged Out Successfully!");

                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while (choice != 5);

    }
}