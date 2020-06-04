package hyperskillcodechallenge;

import java.util.Scanner;

public class RotateRectangleMatrix {
    public static void main(String[] args) {
        
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] matrix = new int[n][m];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        
        
        
        // stampanje dvodimenzionalnog niza 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
