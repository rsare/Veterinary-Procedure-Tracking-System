package com.mycompany.endoftermproject;

import java.util.ArrayList;

/**
 *
 * @author Sare
 */
public class Animals {

    private int id;
    private int age;
    private int totalPriceOfVacc;
    private String name;
    private String gender;
    private Owners infoOfOwner;
    private ArrayList<String> vacc = new ArrayList();

    public Animals(int id, int age, int amountOfPayment, String name, String gender, String infoOfOwner) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;

    }

    public Animals() {
        super();
    }

    void setVacc(int vacNum) {
    }

    void setType(int typeOfAnimal) {
    }

    //Beginning Of Encapsulation
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getTotalPriceOfVacc() {
        return totalPriceOfVacc;
    }

    public void setTotalPriceOfVacc(int totalPriceOfVacc) {
        this.totalPriceOfVacc = totalPriceOfVacc;
    }

    public Owners getInfoOfOwner() {
        return infoOfOwner;
    }

    public void setInfoOfOwner(Owners infoOfOwner) {
        this.infoOfOwner = infoOfOwner;
    }

    public ArrayList<String> getVacc() {
        return vacc;
    }

    public void setVacc(ArrayList<String> vacc) {
        this.vacc = vacc;
    }
    //End Of Encapsulation

}
