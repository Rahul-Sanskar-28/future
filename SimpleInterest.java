import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the principal amount:\n");
        double principal = sc.nextDouble();

        System.out.print("Enter the rate of interest:\n");
        double rate = sc.nextDouble();

        System.out.print("Enter the time (years):\n");
        double time = sc.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        
        System.out.println("\nSimple interest is " + simpleInterest);

        sc.close();
    }
}
