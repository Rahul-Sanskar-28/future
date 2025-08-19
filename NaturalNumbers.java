import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the number of natural numbers to be generated:");
        int N = sc.nextInt();

        // Display first N natural numbers
        System.out.print("First " + N + " natural numbers are : ");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
