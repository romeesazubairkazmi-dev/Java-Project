import java.util.*;
public class HostipalPatientRecordSystem{
     public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("----> Main Menu <----");
        System.out.println("1. Admin Login");
        System.out.println("2. Doctor Login");
        System.out.println("3.Exit");
        System.out.println("Enter number: ");
        int num = input.nextInt();
        switch(num){
            case 1:
                adminLogin();
                break;
            case 2:
                doctorLogin();
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid Input!");
        }
        input.close();    
    }


    public static void  adminLogin(){
        Scanner input = new Scanner (System.in);
        String username = "admin";
        String password = "admin123";
        int attempt = 0;
        Boolean loggedIn = false;

        while (attempt < 3){
            System.out.print("Enter Admin Username: ");
            String user = input.nextLine();
            System.out.print("Enter Admin Password: ");
            String pass = input.nextLine();
            if (user.equals(username) && pass.equals(password)){
                loggedIn = true;
                break;
            }
            else{
                attempt++;
                System.out.println("Incorrect login! Attempts left : " + (3-attempt));
            }
        }
        if (!loggedIn){
            System.out.println("You have used all attempts. Returning to main menu.....");
            return;
        }
	int choice;
        do{
            System.out.println("\n==== ADMIN MENU ====");
            System.out.println("1. Add Patient Record");
            System.out.println("2. View All Pateints");
            System.out.println("3. Update Patient Record");
            System.out.println("4. Search Patient (by ID)");
            System.out.println("5. Billing");
            System.out.println("6. Logout");
            System.out.print("Enter user choice:");
            choice = input.nextInt();
            switch(choice){
                case 1:
                    addPatientRecord();
                    break;
                case 2:
                    viewAllPatients();
                    break;
                case 3:
                    updatePatientRecord();
                    break;
                case 4:
                    searchPatientByID();
                    break;
                case 5:
                    billing();
                    break;
                case 6:
                    System.out.println("Logging Out......");
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
        }
        while(choice != 6);
    }

    public static void addPatientRecord(){
        System.out.println("Adding Patient Record....");
        return;
    }
    public static void viewAllPatients(){
        System.out.println("Viewing All Patients....");
        return;
    }
    public static void updatePatientRecord(){
        System.out.println("Updating Patient Record....");
        return;
    }
    public static void searchPatientByID(){
        System.out.println("Searching Patient By ID....");
        return;
    }
    public static void billing(){
        System.out.println("Billing....");
        return;
    }

    public static void doctorLogin(){
	return;
    }
}
   


