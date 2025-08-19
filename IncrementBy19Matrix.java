public class IncrementBy19Matrix {
    public static void main(String[] args) {
        int rows = 3; // Number of rows
        int cols = 3; // Number of columns
        int num = 19; // Starting number
        int increment = 19; // Increment value

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(num + " ");
                num += increment; // Increase by 19
            }
            System.out.println(); // Move to next row
        }
    }
}
