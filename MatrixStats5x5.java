public class MatrixStats5x5 {
    public static void main(String[] args) {
        // Define 5x5 matrix
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {5, 1, 2, 3, 4},
            {4, 5, 1, 2, 3},
            {3, 4, 5, 1, 2},
            {2, 3, 4, 5, 1}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int biggest = matrix[0][0];
        int smallest = matrix[0][0];
        int sum = 0;

        // Traverse the matrix
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

        // Print matrix
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
