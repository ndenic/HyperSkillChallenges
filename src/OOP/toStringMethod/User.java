/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.toStringMethod;

/**
 *
 * @author nikolad
 */
public class User {

    private String login;
    private String firstName;
    private String lastName;

    public User(String login, String firstName, String lastName) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //login=javagod,firstName=James,lastName=Gosling
    @Override
    public String toString() {
        return "login=" + this.login + ",firstName=" + this.firstName + ",lastName=" + this.lastName;
    }
}
