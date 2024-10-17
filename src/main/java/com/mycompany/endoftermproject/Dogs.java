package com.mycompany.endoftermproject;

/**
 *
 * @author Sare
 */
public class Dogs extends Animals {
    
    private String typeOfDog;
    private String[] typesOfDog = {"Pitbull", "Akita Dog", "Rottweiler"};
    

    public Dogs(int id, int age, int amountOfPayment, String name, String gender, String vacc, String typeOfDog, String infoOfowner) {
        super();

    }

    public Dogs() {
        super();
    }

    //Method Showing The Prices Of Vaccines For Dogs
    @Override
    void setVacc(int vacNum) {
        if (vacNum == 1) {
            super.setTotalPriceOfVacc(super.getTotalPriceOfVacc() + 1500);
            getVacc().add("Canine Hepatitis");
        } else if (vacNum == 2) {
            super.setTotalPriceOfVacc(super.getTotalPriceOfVacc() + 1350);
            getVacc().add("Dirofilariasis");
        } else if (vacNum == 3) {
            super.setTotalPriceOfVacc(super.getTotalPriceOfVacc() + 900);
            getVacc().add("Rabies");
        }

    }

    @Override
    void setType(int typeOfAnimal) {
        typeOfDog = typesOfDog[typeOfAnimal];
    }

    //Beginning Of Encapsulation
    public String getTypeOfDog() {
        return typeOfDog;
    }

    public void setTypeOfDog(String typeOfDog) {
        this.typeOfDog = typeOfDog;
    }

    //End Of Encapsulation
}
