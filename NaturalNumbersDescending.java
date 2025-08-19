import java.util.Scanner;

public class NaturalNumbersDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the number of natural numbers to be generated:");
        int N = sc.nextInt();

        // Display first N natural numbers in descending order
        System.out.print("The first " + N + " natural numbers in descending order are: ");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
