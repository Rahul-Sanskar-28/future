import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the 1st number num1:\n");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number num2:\n");
        int num2 = sc.nextInt();

        System.out.print("Enter the 3rd number num3:\n");
        int num3 = sc.nextInt();

        // Find biggest
        int biggest;
        if (num1 >= num2 && num1 >= num3) {
            biggest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            biggest = num2;
        } else {
            biggest = num3;
        }

        // Output
        System.out.println("The biggest of the 3 numbers entered is: " + biggest);

        sc.close();
    }
}
