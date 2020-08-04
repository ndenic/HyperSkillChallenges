/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BigIntegerMath;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class DoubleFactorial {

    public static BigInteger getDoubleFactorial(long f) {
        if(f == 0 || f == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(f).multiply(getDoubleFactorial(f-2));
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(getDoubleFactorial(n));
        

    }

}
