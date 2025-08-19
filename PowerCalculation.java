import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter base number (m): ");
        int m = sc.nextInt();
        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        long result = 1;
        int exponent = n;

        // If exponent is negative, handle separately
        if (n < 0) {
            System.out.println("Negative exponents are not supported in this integer version.");
            sc.close();
            return;
        }

        // Multiply m, n times
        while (exponent > 0) {
            result *= m;
            exponent--;
        }

        // Output
        System.out.println(m + "^" + n + " = " + result);

        sc.close();
    }
}
