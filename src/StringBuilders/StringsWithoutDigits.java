package StringBuilders;

import java.util.Scanner;

public class StringsWithoutDigits {

    static char[] SKIPPED_CHARS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' '};

    public static String concatStringsWithoutDigits(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            for (char c : s.toCharArray()) {
                boolean skip = false;
                for (char skippedChar : SKIPPED_CHARS) {
                    if (c == skippedChar) {
                        skip = true;
                        break;
                    }
                }
                if (!skip) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatStringsWithoutDigits(strings);
        System.out.println(result);
    }
}
