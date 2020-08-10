/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class ConvertingAndMultiplying {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        String s;
        while (true) {
            s = sc.next();
            if (s.equals("0")) {
                break;
            }
            try {
                x = Integer.parseInt(s) * 10;
                System.out.println(x);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + s);

            }

        }

    }
}
