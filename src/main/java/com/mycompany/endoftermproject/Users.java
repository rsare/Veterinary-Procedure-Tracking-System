package com.mycompany.endoftermproject;

/**
 *
 * @author Sare
 */
public class Users {

    private String firstName;
    private String lastName;
    private String password;
    private String userName;

    //Beginning Of Encapsulation
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        if (firstName.length() != 0) {
            System.out.println("\n\nFirst Name : " + firstName);
        } else {
            System.out.println("Please enter your first name !");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        if (lastName.length() != 0) {
            System.out.println("Last Name : " + lastName);
        } else {
            System.out.println("Please enter your last name !");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        System.out.println("Password : " + password);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        System.out.println("Username : " + userName);
    }
    //End Of Encapsulation
}
