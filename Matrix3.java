public class Matrix3 {
    public static void main(String[] args) {
        
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {2, 3, 1}
        };
        
        int[][] matrixB = {
            {7, 8, 2},
            {9, 1, 4},
            {2, 3, 0}
        };
        
        int[][] result = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        System.out.println("Resultant Matrix (Multiplication Output):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
