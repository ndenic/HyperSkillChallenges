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
public class TenDaysBefore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date_input = sc.next();
        LocalDate date = LocalDate.parse(date_input);
        System.out.println(date.minusDays(10));
        
    }
}
