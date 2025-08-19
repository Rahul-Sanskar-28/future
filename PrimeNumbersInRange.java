import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept lower and upper bounds
        System.out.println("Enter the lower bound value:");
        int lower = sc.nextInt();

        System.out.println("Enter the upper bound value:");
        int upper = sc.nextInt();

        System.out.print("The prime numbers between " + lower + " and " + upper + " are: ");

        // Loop through numbers from lower to upper
        for (int num = lower; num <= upper; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
