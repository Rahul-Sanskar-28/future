import java.util.Scanner;

public class IncrementDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a five digit number: ");
        int num = sc.nextInt();

        if (num < 10000 || num > 99999) {
            System.out.println("Please enter a valid five digit number!");
        } else {
            String numStr = Integer.toString(num);
            StringBuilder result = new StringBuilder();

            // Increment each digit
            for (int i = 0; i < numStr.length(); i++) {
                int digit = numStr.charAt(i) - '0'; // convert char to int
                digit = (digit + 1) % 10;           // increment and wrap around if 9
                result.append(digit);
            }

            // Output
            System.out.println("Output: " + result.toString());
        }

        sc.close();
    }
}
