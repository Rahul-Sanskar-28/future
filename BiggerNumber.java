import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first number
        System.out.print("Enter the first number num1:\n");
        int num1 = sc.nextInt();

        // Input second number
        System.out.print("Enter the second number num2:\n");
        int num2 = sc.nextInt();

        // Find bigger number
        int bigger;
        if (num1 > num2) {
            bigger = num1;
        } else {
            bigger = num2;
        }

        // Output result
        System.out.println("\nThe bigger of the two numbers entered (" + num1 + " and " + num2 + ") is: " + bigger);

        sc.close();
    }
}
