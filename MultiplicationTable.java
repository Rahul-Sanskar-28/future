import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept number from user
        System.out.println("Enter the number to generate its multiplication table:");
        int num = sc.nextInt();

        System.out.println("Multiplication table for " + num + " is :");

        // Generate multiplication table up to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

        sc.close();
    }
}
