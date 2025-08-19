import java.util.Scanner;

public class SeriesSumCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept n from user
        System.out.println("Enter a number n:");
        int n = sc.nextInt();

        double sum = 0.0;

        // Calculate sum of series 1/2^3 + 1/3^3 + ... + 1/n^3
        for (int i = 2; i <= n; i++) {
            sum += 1.0 / (i * i * i); // i^3
        }

        // Display result
        System.out.println("The sum of the series 1/2^3 + 1/3^3 + ... + 1/" + n + "^3 is: " + sum);

        sc.close();
    }
}
