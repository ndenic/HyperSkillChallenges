/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author nikolad
 */
public class BackwardIndexes {
    public static <T> T getElementByIndex(List<T> lst, int index) {
       if(index==0){
            return lst.get(0);
        }else if(index>0){
            if(index>lst.size()){
                throw new IndexOutOfBoundsException();
            }
            return lst.get(index);

        }
        return lst.get(lst.size()-Math.abs(index)); 
    }

    
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final List<String> values = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        final int index = Integer.parseInt(scanner.nextLine());

        try {
            String element = getElementByIndex(values, index);
            System.out.println(element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception");
        }
    }
}
