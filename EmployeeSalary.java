import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the empno:\n");
        int empno = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter the employee name:\n");
        String name = sc.nextLine();

        System.out.print("Enter the monthly salary:\n");
        double monthlySalary = sc.nextDouble();

        // Calculate yearly salary
        double yearlySalary = monthlySalary * 12;

        
        System.out.printf("Hi %s! Your employee id is %d, monthly salary is Rs %.0f and yearly salary is Rs %.0f.\n",
                          name, empno, monthlySalary, yearlySalary);

        sc.close();
    }
}
