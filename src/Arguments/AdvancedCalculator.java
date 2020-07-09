/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arguments;

/**
 *
 * @author nikol
 */
public class AdvancedCalculator {

    public static void main(String[] args) {
        String operator = args[0];
        int result = Integer.parseInt(args[1]);
        if ("MAX".equals(operator)) {
            for (int i = 1; i < args.length; i++) {
                if (Integer.parseInt(args[i]) >= result) {
                    result = Integer.parseInt(args[i]);
                }
            }
            System.out.println(result);
        } else if ("MIN".equals(operator)) {
            for (int i = 1; i < args.length; i++) {
                if (Integer.parseInt(args[i]) < result) {
                    result = Integer.parseInt(args[i]);
                }
            }
            System.out.println(result);
        } else if ("SUM".equals(operator)) {
            for (int i = 2; i < args.length; i++) {
                result += Integer.parseInt(args[i]);
            }
            System.out.println(result);
        } else {
            System.out.println("Unknown operator");
        }
    }
}
