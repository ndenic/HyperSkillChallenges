/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class WholeHoursBetween {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        LocalDateTime firstDate = LocalDateTime.parse(first);
        LocalDateTime secondDate = LocalDateTime.parse(second);
        long minutes = ChronoUnit.HOURS.between(firstDate, secondDate);
        System.out.println(minutes);

    }
}
