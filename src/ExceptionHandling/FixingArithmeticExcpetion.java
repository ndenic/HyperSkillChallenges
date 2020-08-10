/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.util.Scanner;

/**
 *
 * @author nikolad
 */
public class FixingArithmeticExcpetion {

    private String firstName;
    private String lastName;

    public FixingArithmeticExcpetion() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public String getFullName() {
        if (this.firstName != null && this.lastName != null) {
            return this.firstName + " " + this.lastName;
        } else if (this.firstName != null) {
            return this.firstName;
        } else {
            return this.lastName;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (d != 0 && b + c > 0) {
            int result = a / ((b + c) / d);
            System.out.println(result);
        } else {
            System.out.println("Division by zero!");
        }

    }

}
