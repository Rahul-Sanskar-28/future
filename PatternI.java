public class PatternI {
    public static void main(String[] args) {
        int rows = 7;    // Total number of rows
        int cols = 9;    // Total number of columns (width)
        int mid = cols / 2; // Middle column for vertical line

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Top row, bottom row, or middle column
                if (i == 0 || i == rows - 1 || j == mid) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" "); // Space for better formatting
            }
            System.out.println();
        }
    }
}
