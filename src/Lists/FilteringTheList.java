/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import java.util.*;
/**
 *
 * @author nikolad
 */
public class FilteringTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        String input = scanner.nextLine();
        int index = 0;

        for (String i : input.split("\\s+")) {
            index++;
            if (index % 2 == 0) {
                list.add(Integer.parseInt(i));
            }
        }

        Collections.reverse(list);

        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
