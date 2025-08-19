import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int count = 0;
        int n = num;

        // Handle case for 0 explicitly
        if (n == 0) {
            count = 1;
        } else {
            // While loop to count digits
            while (n != 0) {
                n = n / 10;  // remove last digit
                count++;
            }
        }

        
        System.out.println("The number of digits in the entered number is " + count);

        sc.close();
    }
}
