/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTime;

import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class SomeHoursAndSomeMinutesAgo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        int beforeH = sc.nextInt();
        int beforeM = sc.nextInt();
        LocalTime localt = LocalTime.parse(time).minusHours(beforeH).minusMinutes(beforeM);
        System.out.println(localt);
    }

}
