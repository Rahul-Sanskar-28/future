import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the marks scored in 1st subject:");
        int mark1 = sc.nextInt();

        System.out.println("Enter the marks scored in 2nd subject:");
        int mark2 = sc.nextInt();

        System.out.println("Enter the marks scored in 3rd subject:");
        int mark3 = sc.nextInt();

        
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        
        String grade;
        if (average < 35) {
            grade = "C";
        } else if (average >= 35 && average < 60) {
            grade = "B";
        } else {
            grade = "A";
        }

        
        System.out.println("\nTotal marks: " + total);
        System.out.println("Average is: " + average);
        System.out.println("Grade: \"" + grade + "\"");

        sc.close();
    }
}
