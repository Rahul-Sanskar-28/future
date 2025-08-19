import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept number from user
        System.out.println("Enter any number:");
        int num = sc.nextInt();

        long factorial = 1;

        // Calculate factorial
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Display result
        System.out.println("The factorial of " + num + " is " + factorial);

        sc.close();
    }
}
