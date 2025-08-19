import java.util.Scanner;

public class BillingAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the billing amount:\n");
        double amount = sc.nextDouble();

        double netAmount;

        
        if (amount > 6000) {
            netAmount = amount - (amount * 0.10);
        } else {
            netAmount = amount;
        }

        
        System.out.println("Your net billing amount: " + netAmount);

        sc.close();
    }
}
