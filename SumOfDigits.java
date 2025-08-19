import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int sum = 0;
        int n = Math.abs(num);  // handle negative numbers too

        // While loop to extract digits
        while (n != 0) {
            int digit = n % 10;  // get last digit
            sum += digit;        // add to sum
            n = n / 10;          // remove last digit
        }

        // Output
        System.out.println("The sum of digits of the entered number is " + sum);

        sc.close();
    }
}
