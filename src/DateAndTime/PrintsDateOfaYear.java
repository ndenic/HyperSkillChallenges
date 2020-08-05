/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class PrintsDateOfaYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        int n = sc.nextInt();
        LocalDate d = LocalDate.parse(date);
        for (LocalDate i = d; i.getYear() == d.getYear() ;i = i.plusDays(n)) {
            System.out.println(i.toString());
            
        }
    }
}
