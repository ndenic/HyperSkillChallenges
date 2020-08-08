/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTime;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class DontBeLateAgain {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            if (LocalTime.parse(scanner.next()).isAfter(LocalTime.parse("20:00"))) {
                System.out.println(name);
            }
        }
    }
}
