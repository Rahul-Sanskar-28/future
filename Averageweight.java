import java.util.Scanner;

public class Averageweight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the weight of the first person:\n");
        double w1 = sc.nextDouble();

        System.out.print("Enter the weight of the second person:\n");
        double w2 = sc.nextDouble();

        System.out.print("Enter the weight of the third person:\n");
        double w3 = sc.nextDouble();

        
        double sum = w1 + w2 + w3;
        double avg = sum / 3;

        
        System.out.printf("The sum of weight of the 3 persons is %.1f Kgs and the average weight is %.1f Kgs\n", sum, avg);

        sc.close();
    }
}
