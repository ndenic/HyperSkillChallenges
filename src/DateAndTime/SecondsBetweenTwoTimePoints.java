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
public class SecondsBetweenTwoTimePoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        LocalTime firstT = LocalTime.parse(first);
        LocalTime secondT = LocalTime.parse(second);
        long result = firstT.toSecondOfDay() - secondT.toSecondOfDay();
        System.out.println(Math.abs(result));
    }
    
}
