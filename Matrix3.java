import java.util.*;

// Fixed the public class name so it matches the file name and compiles correctly.
public class Matrix3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row of 1st matrix array : ");
        int r = sc.nextInt();
        System.out.print("Enter column of 1st matrix array : ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter elements of 1st matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.print("Enter row of 2nd matrix array : ");
        int r1 = sc.nextInt();
        System.out.print("Enter column of 2nd matrix array : ");
        int c1 = sc.nextInt();
        
        if (c != r1) {
            System.out.println("multiply not possible");
        }else{
            int[][] arr1 = new int[r1][c1];
            System.out.println("Enter elements of 2nd matrix: ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    arr1[i][j] = sc.nextInt();
                }
            }

            int[][] res = new int[r][c1]; 
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c1; j++) {
                    res[i][j] = 0;
                    for (int k = 0; k < c; k++) { 
                        res[i][j] += arr[i][k] * arr1[k][j];
                    }
                }
            }

            System.out.println("\nProduct of the matrices is: ");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}