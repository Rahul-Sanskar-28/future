import java.util.Scanner;

public class PositiveDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter the first number num1:\n");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number num2:\n");
        int num2 = sc.nextInt();

        // Find absolute difference
        int difference = Math.abs(num1 - num2);

        // Output result
        System.out.println("The result (difference) is: " + difference);

        sc.close();
    }
}
