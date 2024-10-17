package com.mycompany.endoftermproject;

/**
 *
 * @author sare
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Veterinary {

    static ArrayList<Users> users = new ArrayList();

    void addCats(int id, int age, int amountOfPayment, String name, String gender, String vacc, String typeOfCat, String infoOfOwner) {
        Cats cat = new Cats(id, age, amountOfPayment, name, gender, vacc, typeOfCat, infoOfOwner);
    }

    void addDogs(int id, int age, int amountOfPayment, String name, String gender, String vacc, String typeOfDog, String infoOfOwner) {
        Dogs dog = new Dogs(id, age, amountOfPayment, name, gender, vacc, typeOfDog, infoOfOwner);
    }

    void addRabbits(int id, int age, int amountOfPayment, String name, String gender, String vacc, String typeOfRabbit, String infoOfOwner) {
        Rabbits rabbit = new Rabbits(id, age, amountOfPayment, name, gender, vacc, typeOfRabbit, infoOfOwner);

    }

    //New Owner-Creating Method
    static void createOwner(String firstName, String lastName, String userName, String password, long ownersNumber) {
        if (firstName.length() == 0) {
            System.out.println("Please Enter Your First Name !");
            return;
        } else if (lastName.length() == 0) {
            System.out.println("Please Enter Your Last Name !");
            return;
        } else if (password.length() == 0) {
            System.out.println("Please Enter Your Password !");
            return;
        }
        Owners owner = new Owners();
        owner.setFirstName(firstName);
        owner.setLastName(lastName);
        owner.setUserName(userName);
        owner.setPassword(password);
        owner.setOwnersNumber(ownersNumber);
        users.add(owner);
    }

}
