package com.mycompany.endoftermproject;

/**
 *
 * @author Sare
 */
public class Rabbits extends Animals {

    private String typeOfRabbit;
    private String[] typesOfRabbits = {"Rex Rabbit", "Holland Lop", "Hothot Rabbit"};

    public Rabbits(int id, int age, int amountOfPayment, String name, String gender, String vacc, String typeOfRabbit, String infoOfOwner) {
        super(id, age, amountOfPayment, name, gender, infoOfOwner);

    }

    public Rabbits() {
        super();

    }

    //Method Showing The Prices Of Vaccines For Rabbits
    @Override
    void setVacc(int vacNum) {
        if (vacNum == 1) {
            super.setTotalPriceOfVacc(super.getTotalPriceOfVacc() + 750);
            getVacc().add("Myxomatosist");
        } else if (vacNum == 2) {
            super.setTotalPriceOfVacc(super.getTotalPriceOfVacc() + 2000);
            getVacc().add("VHS");
        } else if (vacNum == 3) {
            super.setTotalPriceOfVacc(super.getTotalPriceOfVacc() + 900);
            getVacc().add("Rabies");
        }

    }

    @Override
    void setType(int typeOfAnimal) {
        typeOfRabbit = typesOfRabbits[typeOfAnimal];
    }

    //Beginning Of Encapsulation
    public String getTypeOfRabbit() {
        return typeOfRabbit;
    }

    public void setTypeOfRabbit(String typeOfRabbit) {
        this.typeOfRabbit = typeOfRabbit;
    }
    //End Of Encapsulation

}
