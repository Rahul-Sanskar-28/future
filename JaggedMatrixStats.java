public class JaggedMatrixStats {
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7},
            {8, 9},
            {10}
        };

        int biggest = matrix[0][0];
        int smallest = matrix[0][0];
        int sum = 0;

        // Traverse jagged matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        
        System.out.println("\nBiggest element: " + biggest);
        System.out.println("Smallest element: " + smallest);
        System.out.println("Sum of elements: " + sum);
    }
}
