public class NumberSquarePattern {
    public static void main(String[] args) {
        int num = 1; // Starting number
        int rows = 3; // Number of rows
        int cols = 3; // Number of columns

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println(); // Move to next row
        }
    }
}
