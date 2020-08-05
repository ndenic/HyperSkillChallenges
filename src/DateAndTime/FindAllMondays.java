/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class FindAllMondays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);
        
        //Nadji prvo MONDAY;
        DayOfWeek monday = DayOfWeek.MONDAY;
        while (!date.getDayOfWeek().equals(monday)) {
            date = date.plusDays(1);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(date);
            date = date.plusDays(7);
        }

        if (date.getMonthValue() == month) {
           System.out.println(date);
        }

    }
}
