package CollectionsTasks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
/**
 * @author Tat'jana Zhuljabina
 */
public class HTMLParser {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Deque<String> deque = new ArrayDeque<>();
        for (int i = 0; i < input.length() - 2; i++) {
            if (input.charAt(i) == '<') {
                if (input.charAt(i + 1) == '/') {
                    System.out.println(deque.pollLast());
                } else {
                    deque.offerLast(getTagContent(input.substring(i)));
                }
            }
        }
    }

    static String getTagContent(String s) {
        int ind = s.indexOf(">");
        String tag = s.substring(1, ind);
        int indClose = s.indexOf("</" + tag + ">");
        return s.substring(ind + 1, indClose);
    }
}
