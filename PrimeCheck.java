import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter any number:");
        int num = sc.nextInt();

        boolean isPrime = true;

        // Handle numbers less than 2
        if (num < 2) {
            isPrime = false;
        } else {
            // Check for factors from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        
        if (isPrime) {
            System.out.println("The entered number " + num + " is a prime number");
        } else {
            System.out.println("The entered number " + num + " is not a prime number");
        }

        sc.close();
    }
}
