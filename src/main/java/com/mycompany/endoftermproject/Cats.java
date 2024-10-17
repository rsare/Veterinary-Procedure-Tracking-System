package com.mycompany.endoftermproject;

/**
 *
 * @author Sare
 */
public class Cats extends Animals {

     private String typeOfCat;
     private String[] typesOfCat = {"Scotish Fold", "Sfenks", "Tabby"};
   

    public Cats(int id, int age, int amountOfPayment, String name, String gender, String vacc, String typeOfCat, String infoOfowner) {
        super();
    }

    public Cats() {

    }

    //Method Showing The Prices Of Vaccines For Cats

    @Override
    void setVacc(int vacNum) {
        if (vacNum == 1) {
            super.setTotalPriceOfVacc(super.getTotalPriceOfVacc() + 1200);
            getVacc().add("Mixed Vaccine");
        } else if (vacNum == 2) {
            super.setTotalPriceOfVacc(super.getTotalPriceOfVacc() + 1300);
            getVacc().add("Leukemia Vaccine");
        } else if (vacNum == 3) {
            super.setTotalPriceOfVacc(super.getTotalPriceOfVacc() + 900);
            getVacc().add("Rabies");
        }

    }

    @Override
    void setType(int typeOfAnimal) {
        setTypeOfCat(typesOfCat[typeOfAnimal]);
    }

    //Beginning Of Encapsulation
    public String getTypeOfCat() {
        return typeOfCat;
    }

    public void setTypeOfCat(String typeOfCat) {
        this.typeOfCat = typeOfCat;
    }
    //End Of Encapsulation

}
