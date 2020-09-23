/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionsTasks;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nikolad
 */
public class RemovingDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new TreeSet<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            set.add(sc.next());
        }

        set.forEach(item -> {
            System.out.println(item);
        });

    }
}
