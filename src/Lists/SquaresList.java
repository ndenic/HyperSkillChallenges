/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;
/**
 *
 * @author nikolad
 */
public class SquaresList {
     public static Collection<Integer> pow2(Collection<Integer> numbers) {
        Collection<Integer> newOne = new ArrayList<>();
        for (Integer num : numbers){
              newOne.add(num*num);
        }

        return newOne;
    }

/* Please, do not modify this I/O code */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Collection<Integer> result = SquaresList.pow2(numbers);

        System.out.println(result.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}
