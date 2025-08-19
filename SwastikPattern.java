public class SwastikPattern {
    public static void main(String[] args) {
        int n = 11; // size of the matrix (must be odd)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 && j <= n / 2 ||                 // top row (left half)
                    j == n / 2 ||                           // middle column
                    i == n / 2 ||                           // middle row
                    j == 0 && i >= n / 2 ||                 // left column (bottom half)
                    i == n - 1 && j >= n / 2 ||             // bottom row (right half)
                    j == n - 1 && i <= n / 2) {             // right column (top half)
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
