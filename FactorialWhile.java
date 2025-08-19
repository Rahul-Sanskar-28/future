import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        // Handle negative numbers
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int i = 1;
            long fact = 1; // use long to avoid overflow for bigger numbers

            // While loop to calculate factorial
            while (i <= num) {
                fact *= i;
                i++;
            }

            // Output
            System.out.println("Factorial of " + num + " is " + fact);
        }

        sc.close();
    }
}
