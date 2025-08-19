import java.util.Scanner;

public class ConvertToPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number:\n");
        int num = sc.nextInt();

        
        if (num < 0) {
            num = -num;
        }

        
        System.out.println("The result is: " + num);

        sc.close();
    }
}
