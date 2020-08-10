/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class FixingNullPointerException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = "null".equals(string) ? null : string;

        System.out.println(Objects.equals(string, null) ? "NPE!" : string.toLowerCase());
    }
}
