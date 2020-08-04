/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomNum;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class GuassianRandomNum {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        double M = scanner.nextDouble();
        
        while (true) {
            Random random = new Random(K);
            int i;
            for (i = 0; i < N; i++) {
                double num = random.nextGaussian();
                if (num > M) {
                    break;
                }
            }
            if (i == N) {
                System.out.println(K);
                break;
            }
            K++;
        }
        
        
    }
}
