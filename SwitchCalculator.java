import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter the 1st Operand num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd Operand num2: ");
        int num2 = sc.nextInt();

        // Menu
        System.out.println("1. add");
        System.out.println("2. sub");
        System.out.println("3. mul");
        System.out.println("4. div");
        System.out.println("5. mod");

        // Operator choice
        System.out.print("Enter the operator: ");
        int choice = sc.nextInt();

        // Switch block
        switch (choice) {
            case 1:
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
                break;
            case 2:
                System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
                break;
            case 3:
                System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0)
                    System.out.println("The division of " + num1 + " and " + num2 + " is " + (num1 / num2));
                else
                    System.out.println("Error: Division by zero is not allowed!");
                break;
            case 5:
                if (num2 != 0)
                    System.out.println("The modulus of " + num1 + " and " + num2 + " is " + (num1 % num2));
                else
                    System.out.println("Error: Modulus by zero is not allowed!");
                break;
            default:
                System.out.println("Invalid operator choice!");
        }

        sc.close();
    }
}
