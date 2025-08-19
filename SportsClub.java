import java.util.Scanner;

public class SportsClub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the name:\n");
        String name = sc.nextLine();

        System.out.print("Enter the mobile number:\n");
        String mobile = sc.nextLine();

        System.out.print("Enter the age:\n");
        int age = sc.nextInt();

        // Check eligibility
        if (age < 18) {
            System.out.println("Sorry! You need to be at least 18 years old to get membership.");
            sc.close();
            return;  // Exit the program
        }

        // If eligible
        System.out.println("Congratulations, " + name + "!");
        System.out.println("Your membership registration is successful.");
        System.out.println("Registered mobile number: " + mobile);

        sc.close();
    }
}
