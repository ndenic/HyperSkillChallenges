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
public class TheSmallestValue {

    public static BigInteger getFactorial(long f) {
        BigInteger result = BigInteger.ONE;
        for (long i = 1; i <= f; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.nextLine());
        for (long i = 1; i < Long.MAX_VALUE; i++) {
            if (getFactorial(i).compareTo(a) >= 0) {
                System.out.println(i);
                break;
            }
        }
    }

}
