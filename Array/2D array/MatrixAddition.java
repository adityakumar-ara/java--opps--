// Question 26: Write a program to perform matrix addition using 2D arrays.

class MatrixAddition {
    public static void main(String[] args) {
        // First 2D array (Matrix A)
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        // Second 2D array (Matrix B)
        int[][] matrixB = {
            {7, 8, 9},
            {1, 2, 3}
        };
        
        // Array to store the sum (Matrix C)
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] sumMatrix = new int[rows][cols];
        
        System.out.println("Sum of the two matrices is:");
        
        // Loop to add corresponding elements of both matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}