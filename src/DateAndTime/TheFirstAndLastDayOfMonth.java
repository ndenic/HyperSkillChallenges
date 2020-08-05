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
public class TheFirstAndLastDayOfMonth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        LocalDate date = LocalDate.of(year, month, 1);
        LocalDate endOfMonth = LocalDate.of(year, month, date.lengthOfMonth());
        System.out.println(date + " " + endOfMonth);

    }
}
