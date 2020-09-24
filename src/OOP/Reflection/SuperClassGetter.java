/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Reflection;

/**
 *
 * @author nikolad
 */
public class SuperClassGetter {

    public Class getSuperClassByName(String name) throws ClassNotFoundException {
        return Class.forName(name).getSuperclass();
    }

    public Class getSuperClassByInstance(Object object) {
        return object.getClass().getSuperclass();
    }
}
