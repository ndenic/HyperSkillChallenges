package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateRectangleMatrix {

    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        // unosimo bilo koje vrednosti tipa integer u niz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] ret = new int[m][n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                ret[c][n - 1 - r] = matrix[r][c];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ret[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
