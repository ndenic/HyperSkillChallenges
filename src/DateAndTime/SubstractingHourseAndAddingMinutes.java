/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTime;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class SubstractingHourseAndAddingMinutes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int h = sc.nextInt();
        int m = sc.nextInt();
        LocalDateTime ldt = LocalDateTime.parse(input).minusHours(h).plusMinutes(m);
        System.out.println(ldt);
    }
}
