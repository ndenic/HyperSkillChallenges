/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.polymorphism;

/**
 *
 * @author nikolad
 */
public class Publication {

    public String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        return getType() + this.getDetails();
    }

    public String getType() {
        return "Publication: ";
    }

    public String getDetails() {
        return this.title;
    }
}
