public class NumberPatternRows {
    public static void main(String[] args) {
        int num = 1; // Starting number
        int rows = 4; // Number of rows

        for (int i = 1; i <= rows; i++) { 
            for (int j = 1; j <= i; j++) { // Row i has i numbers
                System.out.print(num + " ");
                num++;
            }
            System.out.println(); // Move to next row
        }
    }
}
