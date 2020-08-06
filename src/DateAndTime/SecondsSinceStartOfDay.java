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
public class SecondsSinceStartOfDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfSeconds = sc.nextInt();
        LocalTime time = LocalTime.ofSecondOfDay(numOfSeconds);

        System.out.println(time);

    }
}
