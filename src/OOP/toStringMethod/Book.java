/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.toStringMethod;

import java.util.Arrays;

/**
 *
 * @author nikolad
 */
public class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    //title=Java 8 & 9 in Action,yearOfPublishing=2017,authors=[Mario Fusco,Alan Mycroft]
    @Override
    public String toString() {
        return "title=" + this.title + ",yearOfPublishing=" + this.yearOfPublishing + ",authors=[" + Arrays.toString(authors).join(",", authors) + "]";
    }
}
