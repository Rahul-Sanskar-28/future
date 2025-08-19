import java.util.Scanner;

public class PrimeDigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int n = Math.abs(num); // handle negative numbers too
        int count = 0;

        // While loop to check each digit
        while (n != 0) {
            int digit = n % 10; // extract last digit

            // Check if digit is prime (2, 3, 5, 7)
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                count++;
            }

            n /= 10; // remove last digit
        }

        
        System.out.println("Number of prime digits in the entered number is " + count);

        sc.close();
    }
}
