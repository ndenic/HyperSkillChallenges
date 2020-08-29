/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoxingUnboxing;

/**
 *
 * @author nikolad
 */
public class OnlyTrueOrFalse {

    public static boolean toPrimitive(Boolean b) {
        return b == null ? false : b;

    }

    public static void main(String[] args) {
        System.out.println(toPrimitive(true));
    }
}
