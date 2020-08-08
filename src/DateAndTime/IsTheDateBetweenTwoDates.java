/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTime;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class IsTheDateBetweenTwoDates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String m = sc.next();
        String n = sc.next();

        LocalDate between = LocalDate.parse(x);
        LocalDate first = LocalDate.parse(m);
        LocalDate second = LocalDate.parse(n);

        if ((first.isAfter(between) && second.isBefore(between))
                || (second.isAfter(between) && first.isBefore(between))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
