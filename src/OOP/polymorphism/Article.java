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
public class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getType() {
        return "Article ";
    }

    public String getDetails() {
        return "(author - " + this.author + "): " + super.title;
    }

}
