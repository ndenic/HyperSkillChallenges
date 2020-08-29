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
public class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    public String getType() {
        return "Newspaper ";
    }

    // Newspaper (source - Sport news): Football results
    public String getDetails() {
        return "(source - " + this.source + "): " + super.title;
    }
}
