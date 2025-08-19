import java.util.Scanner;

public class OddSeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a number n:");
        int n = sc.nextInt();

        int sum = 0;

        System.out.print("The series of odd numbers up to " + n + " is: ");

        // Generate odd numbers and calculate sum
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }

        
        System.out.println("\nThe sum of the numbers in the series is: " + sum);

        sc.close();
    }
}
