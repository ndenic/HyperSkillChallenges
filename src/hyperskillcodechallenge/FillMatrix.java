package hyperskillcodechallenge;

import java.util.Scanner;

public class FillMatrix {

    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] matrix = new int[size][size]; // velicine size x size

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Math.abs(i - j);
            }
        }

        // stampaj dvodimenzionalni niz u formi matrice 
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
