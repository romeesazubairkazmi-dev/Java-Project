
import java.util.*;
public class DoctorLoginSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String correctUser = "doctor";
        String passKey = "1234";
        int attempts = 0;
        boolean loggedIn = false;

        while(attempts < 3){
            System.out.print("Enter Doctor Username: ");
            String user = sc.nextLine();
            System.out.print("Enter Doctor Password: ");
            String pass = sc.nextLine();
            if(user.equals(correctUser) && pass.equals(passKey)){
                loggedIn = true;
                break;
            }
            else {
                attempts++;
                System.out.println("Incoorect login! Attempts left:" +(3- attempts));
            }

        }
        if(!loggedIn){
            System.out.println("\nYou have used all the Attempts! Returning to MAIN MENU..");
            return;
        }
        int choice;
        do{
            System.out.println("\n===== DOCTOR MENU =====");
            System.out.println("1. View My Patients");
            System.out.println("2. Search Patients (by ID)");
            System.out.println("3. Prescription");
            System.out.println("4. Test");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Viewing my patients...");
                    break;

                case 2:
                    System.out.println("Searching patient by ID...");
                    break;

                case 3:
                    System.out.println("Prescription section...");
                    break;

                case 4:
                    System.out.println("Test section...");
                    break;

                case 5:
                    System.out.println("Logging out...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);
    }
}
    

 