/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionsTasks;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author nikolad
 */
public class SymmetricDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String strSet1 = scanner.nextLine();
        String strSet2 = scanner.nextLine();

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        if (!Objects.equals(strSet1, "empty")) {
            Collections.addAll(set1, strSet1.split("\\s+"));
        }

        if (!Objects.equals(strSet2, "empty")) {
            Collections.addAll(set2, strSet2.split("\\s+"));
        }

        Set<String> resultSet = SetUtils.symmetricDifference(set1, set2);

        System.out.println(String.join(" ", resultSet));
    }
}
