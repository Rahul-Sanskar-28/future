import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the upper bound number to generate the Fibonacci numbers:");
        int n = sc.nextInt();

        System.out.print("Fibonacci series up to the entered number is: ");

        int a = 0, b = 1;
        if (n >= 0) System.out.print(a + " ");  // print 0 if n >= 0
        if (n >= 1) System.out.print(b + " ");  // print 1 if n >= 1

        int next = a + b;
        while (next <= n) {
            System.out.print(next + " ");
            a = b;
            b = next;
            next = a + b;
        }

        sc.close();
    }
}
