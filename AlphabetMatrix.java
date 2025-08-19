public class AlphabetMatrix {
    public static void main(String[] args) {
        int rows = 3; // Number of rows
        int cols = 3; // Number of columns
        char ch = 'A'; // Starting character

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(ch + " ");
                ch++; // Move to next letter
            }
            System.out.println(); // Move to next row
        }
    }
}
