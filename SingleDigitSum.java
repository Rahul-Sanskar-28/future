import java.util.Scanner;

public class SingleDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int n = Math.abs(num); // handle negative numbers
        int sum;

        // Repeat until sum is a single digit
        while (n >= 10) {
            sum = 0;
            while (n != 0) {
                sum += n % 10;  // add last digit
                n /= 10;        // remove last digit
            }
            n = sum; // update number with sum
        }

        
        System.out.println("Single digit sum is: " + n);

        sc.close();
    }
}
