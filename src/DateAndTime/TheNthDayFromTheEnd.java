/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class TheNthDayFromTheEnd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int n = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);
        List<Integer> days = new ArrayList();
        for (int i = 1; i <= date.lengthOfMonth(); i++) {
            days.add(i);
        }
        days.sort(Collections.reverseOrder());
        System.out.println(days);
        int day = days.get(n - 1);
        System.out.println(LocalDate.of(date.getYear(), date.getMonth(), day));

    }
}
