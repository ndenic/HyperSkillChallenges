/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.abstractClass;

/**
 *
 * @author nikolad
 */
public class Multiplication extends IntBinaryOperation {

    public Multiplication(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public int perform() {
        return this.firstArg * this.secondArg;
    }

}
