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
public class GenerateRandomNums {

    public static void main(String[] args) {

        long n;
        int a, b;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        a = sc.nextInt();
        b = sc.nextInt();
        Random brojka = new Random(a + b);

        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += brojka.nextInt(b - a + 1) + a;
        }
        System.out.println(suma);
    }

}
