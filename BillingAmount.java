import java.util.Scanner;

public class BillingAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input billing amount
        System.out.print("Enter the billing amount:\n");
        double amount = sc.nextDouble();

        double netAmount;

        // Apply discount if amount > 6000
        if (amount > 6000) {
            netAmount = amount - (amount * 0.10);
        } else {
            netAmount = amount;
        }

        // Display result
        System.out.println("Your net billing amount: " + netAmount);

        sc.close();
    }
}
