/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class FindTheNearestNum {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] items = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String item : items) {
            numbers.add(Integer.parseInt(item));
        }

        int n = scanner.nextInt();
        ArrayList<Integer> result = new ArrayList<>();

        int delta = Integer.MAX_VALUE;
        for (int i : numbers) {
            if (Math.abs(i - n) < delta) {
                delta = Math.abs(i - n);
                result.clear();
                result.add(i);
            } else if (Math.abs(i - n) == delta) {
                result.add(i);
            }
        }

        Collections.sort(result);
        
        for (int item : result) {
            System.out.print(item + " ");
        }

    }

}
