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
public class ExpressionWithLargeNums {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a, b, c, d;
        a = sc.nextBigInteger();
        b = sc.nextBigInteger();
        c = sc.nextBigInteger();
        d = sc.nextBigInteger();
        System.out.println(a.negate().multiply(b).add(c).subtract(d));
    }
    
}
