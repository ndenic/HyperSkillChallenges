/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionsTasks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class GettingTheMaxElementOfStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String[] commands = scanner.nextLine().split("\\s");
            switch (commands[0]) {
                case "push":
                    int value = Integer.parseInt(commands[1]);
                    if (stack.isEmpty() || value > stack.peekLast()) {
                        stack.offerLast(value);
                    } else {
                        stack.offerLast(stack.peekLast());
                    }
                    break;
                case "pop":
                    stack.pollLast();
                    break;
                case "max":
                    System.out.println(stack.peekLast());
                    break;
                default:
            }
        }
    }
}
