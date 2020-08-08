/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTime;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class TheNewYearIsComming {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate date = LocalDate.parse(scanner.next());
        date = date.plusDays(Long.parseLong(scanner.next()));
        System.out.println(date.isEqual(LocalDate.of(date.getYear(), 1, 1)));

    }
}
