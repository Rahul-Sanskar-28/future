public class SquarePatternA {
    public static void main(String[] args) {
        int size = 7; // Size of the square (both height and width)

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Print the vertical sides of A
                if ((j == 0 || j == size - 1) && i != 0) {
                    System.out.print("@");
                }
                // Print the top horizontal line
                else if (i == 0 && j > 0 && j < size - 1) {
                    System.out.print("@");
                }
                // Print the middle horizontal line
                else if (i == size / 2) {
                    System.out.print("@");
                }
                else {
                    System.out.print(" ");
                }
                System.out.print(" "); // Space for better alignment
            }
            System.out.println();
        }
    }
}
