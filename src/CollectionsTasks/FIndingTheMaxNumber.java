package CollectionsTasks;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FIndingTheMaxNumber {

    public static int findMaxByIterator(Iterator<Integer> iterator) {
        int max = iterator.next();
        while (iterator.hasNext()) {
            int next = iterator.next();
            if (next > max) {
                max = next;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(findMaxByIterator(list.iterator()));
    }
}
