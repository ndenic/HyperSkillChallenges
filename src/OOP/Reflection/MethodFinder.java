/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.Reflection;

import java.lang.reflect.Method;

/**
 *
 * @author nikolad
 */
public class MethodFinder {
    
    public static String findMethod(String methodName, String[] classNames) throws ClassNotFoundException {
        Method[] methods;
        for (String cls : classNames) {
            methods = Class.forName(cls).getMethods();
            for (Method m : methods) {
                //System.out.println(m.getName());
                if (methodName.equals(m.getName())) {
                    return cls;
                }
            }
        }
        return null;
    }
}
