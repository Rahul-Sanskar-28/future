import java.util.Scanner;

public class ConvertToPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number:\n");
        int num = sc.nextInt();

        // Convert negative to positive
        if (num < 0) {
            num = -num;
        }

        // Display result
        System.out.println("The result is: " + num);

        sc.close();
    }
}
