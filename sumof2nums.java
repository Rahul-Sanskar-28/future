import java.util.Scanner;

public class sumof2nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num1 value: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the num2 value: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);

        sc.close();
    }
}
