import java.util.Scanner;

public class Denomination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a four digit number: ");
        int num = sc.nextInt();

        if (num < 1000 || num > 9999) {
            System.out.println("Please enter a valid four digit number!");
        } else {
            int n = num;

            // Extract digits
            int d1 = n / 1000;          // thousands place
            int d2 = (n / 100) % 10;    // hundreds place
            int d3 = (n / 10) % 10;     // tens place
            int d4 = n % 10;            // ones place

            // Output denomination
            System.out.println(d1 + " * 1000 = " + (d1 * 1000));
            System.out.println(d2 + " * 100  = " + (d2 * 100));
            System.out.println(d3 + " * 10   = " + (d3 * 10));
            System.out.println(d4 + " * 1    = " + (d4 * 1));
        }

        sc.close();
    }
}
