import java.util.Scanner;

public class MallDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input billing amount
        System.out.print("Enter the bill amount:\n");
        double billAmount = sc.nextDouble();

        // Input membership card status
        System.out.print("Do you have a membership card? (Y/N)\n");
        char membership = sc.next().charAt(0);

        double discount;

        // Apply discount based on membership
        if (membership == 'Y' || membership == 'y') {
            discount = billAmount * 0.10;  // 10% discount
        } else {
            discount = billAmount * 0.03;  // 3% discount
        }

        double netAmount = billAmount - discount;

        // Display results
        System.out.println("Thank you! Your total bill amount is Rs " + billAmount +
                           ", discount is Rs " + discount +
                           " and net amount payable is Rs " + netAmount + ".");

        sc.close();
    }
}
