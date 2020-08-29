/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoxingUnboxing;

import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class SafeConverting {

    public static int convert(Long val) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        if (val == null) {
            return 0;
        } else if (val > max) {
            return max;
        } else if (val < min) {
            return min;
        } else {
            return val.intValue();
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}
