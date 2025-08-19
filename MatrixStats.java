public class MatrixStats {
    public static void main(String[] args) {
        // Define 3x3 matrix
        int[][] matrix = {
            {5, 6, 7},
            {4, 5, 6},
            {5, 6, 7}
        };

        int rows = 3, cols = 3;
        int biggest = matrix[0][0];
        int smallest = matrix[0][0];
        int sum = 0;

        // Traverse matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int val = matrix[i][j];
                sum += val;

                if (val > biggest) {
                    biggest = val;
                }
                if (val < smallest) {
                    smallest = val;
                }
            }
        }

        
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nBiggest element: " + biggest);
        System.out.println("Smallest element: " + smallest);
        System.out.println("Sum of elements: " + sum);
    }
}
