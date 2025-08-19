import java.util.Scanner;

public class HarmonicSeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a number n:");
        int n = sc.nextInt();

        double sum = 0.0;

        // Calculate the sum of series
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        
        System.out.println("The sum of the series 1 + 1/2 + 1/3 + ... + 1/" + n + " is: " + sum);

        sc.close();
    }
}
