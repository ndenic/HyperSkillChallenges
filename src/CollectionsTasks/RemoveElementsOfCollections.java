package CollectionsTasks;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveElementsOfCollections {

    public static void removeElementsGreaterThanValue(Iterator<Long> iterator, Long val) {
        while (iterator.hasNext()) {
            if (iterator.next() > val) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final List<Long> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Long::parseLong)
                .collect(Collectors.toList());
        final Long edge = Long.parseLong(scanner.nextLine());
        removeElementsGreaterThanValue(list.iterator(), edge);
        list.forEach(e -> System.out.print(e + " "));
    }
}
