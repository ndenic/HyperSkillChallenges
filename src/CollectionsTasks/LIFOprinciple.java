package CollectionsTasks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 *
 * @author nikol
 */
public class LIFOprinciple {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        stack.forEach(item
                -> System.out.println(stack.pop()));
    }

}
