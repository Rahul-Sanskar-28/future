import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int n = num;
        int digits = 0;

        
        int temp = n;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        // Compute Armstrong 
        int sum = 0;
        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        sc.close();
    }
}
