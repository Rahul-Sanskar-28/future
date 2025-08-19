import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int n = Math.abs(num); // handle negative numbers also
        int reverse = 0;

        // While loop to reverse digits
        while (n != 0) {
            int digit = n % 10;           // get last digit
            reverse = reverse * 10 + digit; // append digit
            n = n / 10;                   // remove last digit
        }

        // If input was negative, make reverse negative
        if (num < 0) {
            reverse = -reverse;
        }

        // Output
        System.out.println("Reverse of the entered number is " + reverse);

        sc.close();
    }
}
