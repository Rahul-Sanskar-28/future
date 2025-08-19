import java.util.Scanner;

public class VowelConsonantSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0); // take lowercase for simplicity

        // Check if it's a letter first
        if (!Character.isLetter(ch)) {
            System.out.println("Invalid input! Please enter an alphabet.");
        } else {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a vowel.");
                    break;
                default:
                    System.out.println(ch + " is a consonant.");
            }
        }

        sc.close();
    }
}
