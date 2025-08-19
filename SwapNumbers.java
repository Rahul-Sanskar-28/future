import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter the first number num1:\n");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number num2:\n");
        int num2 = sc.nextInt();

        // Display before swap
        System.out.println("Before swap, the values of num1=" + num1 + " and num2=" + num2);

        // Swap logic
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Display after swap
        System.out.println("After swap, the values of num1=" + num1 + " and num2=" + num2);

        sc.close();
    }
}
