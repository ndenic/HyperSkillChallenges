/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericProgramming;

/**
 *
 * @author nikolad
 */
public class ImmutableArray<T> {

    private T[] items;

    public ImmutableArray(T[] items) {
        this.items = items;
    }

    public T get(int index) {
        return items[index];
    }

    public int length() {
        return items.length;
    }
}
