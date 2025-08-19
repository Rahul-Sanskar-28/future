public class PyramidWithRepeatedPeak {
    public static void main(String[] args) {
        int rows = 4; // Number of rows

        for (int i = 1; i <= rows; i++) {
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Print decreasing numbers starting from i
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to next row
        }
    }
}
