public class IncrementalPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows

        for (int i = 1; i <= rows; i++) { // Loop for each row
            for (int j = 1; j <= i; j++) { // Print numbers from 1 to i
                System.out.print(j + " ");
            }
            System.out.println(); // Move to next row
        }
    }
}
