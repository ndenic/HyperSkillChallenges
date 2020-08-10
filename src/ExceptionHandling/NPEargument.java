/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class NPEargument {
    /* Fix this method */
    public static String toUpperCase(String str) {
        if(Objects.equals(str, null)){
            return str = "";
        }
        return str.toUpperCase(Locale.ENGLISH);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = "none".equalsIgnoreCase(line) ? null : line;
        System.out.println(toUpperCase(line));
    }
}
