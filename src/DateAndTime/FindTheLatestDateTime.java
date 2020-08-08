/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndTime;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class FindTheLatestDateTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        LocalDateTime result = LocalDateTime.parse(scanner.next());

        for (int i = 1; i < count; i++) {
            LocalDateTime date = LocalDateTime.parse(scanner.next());
            if (date.isAfter(result)) {
                result = date;
            }
        }

        System.out.println(result);
    }

}
