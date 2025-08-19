import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number:\n");
        int num = sc.nextInt();

        // Check even or odd
        if (num % 2 == 0) {
            System.out.println("The entered number " + num + " is even");
        } else {
            System.out.println("The entered number " + num + " is odd");
        }

        sc.close();
    }
}
