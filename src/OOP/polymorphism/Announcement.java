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
public class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    public String getType() {
        return "Announcement ";
    }

    public String getDetails() {
        return "(days to expire - " + this.daysToExpire + "): " + super.title;
    }
}
