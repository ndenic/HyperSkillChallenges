/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionsTasks;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author nikolad
 */
public class SetUtils {

    /**
     * @return symmetric difference between set1 and set2
     */
    public static Set<String> symmetricDifference(Set<String> set1, Set<String> set2) {
        Set<String> difference = new HashSet<>(set1);
        difference.addAll(set2);
        Set<String> tmp = new HashSet<>(set1);
        tmp.retainAll(set2);
        difference.removeAll(tmp);
        return difference;
    }
}
