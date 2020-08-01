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
public class BasicCalculator {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        if(args[0].equals("+")){
            System.out.println(a+b);
        }
        else if(args[0].equals("-")){
            System.out.println(a-b);
        }
        else if(args[0].equals("*")){
            System.out.println(a*b);
        }
        else{
            System.out.println("Unknown operator");
        }
    }
}
