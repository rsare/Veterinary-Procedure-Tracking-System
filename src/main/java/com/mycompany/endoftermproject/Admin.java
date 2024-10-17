package com.mycompany.endoftermproject;

/**
 *
 * @author Sare
 */
public class Admin extends Users {

    //Beginning Of Constructors
    public Admin(String firstName, String lastName, long password) {
        super();
    }

    public Admin() {
        super();
    }

    //End Of constructors
    
    //Method of Showing Total Profit
    int getTotalProfit() {
        int totalProfit = 0;
        for (Users user : Veterinary.users) {
            if (user instanceof Owners) {
                Owners owner = (Owners) user;
                for (Animals animal : owner.animals) {
                    totalProfit += animal.getTotalPriceOfVacc();
                }
            }

        }
        return totalProfit;
    }

    //Method Showing All Users
    void showAll() {
        for (Users user : Veterinary.users) {
            if (user instanceof Owners) {
                Owners owner = (Owners) user;
                System.out.println("\n\nOwner's First Name and Last Name : " + owner.getFirstName() + " " + owner.getLastName());
                owner.showTheAnimals();

            }
        }

    }

}
