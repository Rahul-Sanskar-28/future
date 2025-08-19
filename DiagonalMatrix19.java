public class DiagonalMatrix19 {
    public static void main(String[] args) {
        int size = 3; // Matrix size
        int diagonalValue = 19;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    System.out.print(diagonalValue + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // Move to next row
        }
    }
}
