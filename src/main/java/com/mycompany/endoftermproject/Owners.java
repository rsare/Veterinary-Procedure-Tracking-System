package com.mycompany.endoftermproject;

/**
 *
 * @author Sare
 */
import java.util.ArrayList;

public class Owners extends Users {

    private long ownersNumber;  
    private int amountOfPayment;

    ArrayList<Animals> animals = new ArrayList();

    //Beginning Of Constructors
    public Owners(String firstName, String lastName, String userName, String password, long ownersNumber) {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        super.setUserName(userName);
        super.setPassword(password);
        this.ownersNumber = ownersNumber;

    }

    public Owners() {

    }
    //End Of constructors

    //Method of Adding New Cat to the Application
    void addCats(String name, int id, int age, String gender, int typeOfCat, String infoOfOwner) {
        Cats cat = new Cats();
        cat.setName(name);
        cat.setId(id);
        cat.setAge(age);
        cat.setGender(gender);
        cat.setType(typeOfCat);
        animals.add(cat);
    }

    //Method of Adding New Dog to the Application
    void addDogs(String name, int id, int age, String gender, int typeOfDog, String infoOfOwner) {
        Dogs dog = new Dogs();
        dog.setName(name);
        dog.setId(id);
        dog.setAge(age);
        dog.setGender(gender);
        dog.setType(typeOfDog);
        animals.add(dog);
    }

    //Method of Adding New Rabbbit to the Application
    void addRabbits(String name, int id, int age, String gender, int typeOfRabbit, String infoOfOwner) {
        Rabbits rabbit = new Rabbits();
        rabbit.setName(name);
        rabbit.setId(id);
        rabbit.setAge(age);
        rabbit.setGender(gender);
        rabbit.setType(typeOfRabbit);
        animals.add(rabbit);
    }

    //Method Showing All Animals Registered in Veterinary Medicine
    void showTheAnimals() {
        for (Animals animals : animals) {
            System.out.println("-------ANIMAL INFORMATIONS-------");
            System.out.println("Animal Name : " + animals.getName());
            System.out.println("Animal ID : " + animals.getId());
            System.out.println("Animal Age : " + animals.getAge());
            System.out.println("Animal's Gender : " + animals.getGender());
            for (String animals1 : animals.getVacc()) {
                System.out.println("Animal's Vaccination : " + animals1);
            }

            if (animals instanceof Cats) {
                Cats cats = (Cats) animals;
                System.out.println("Animal's Type : " + cats.getTypeOfCat());
            } else if (animals instanceof Dogs) {
                Dogs dogs = (Dogs) animals;
                System.out.println("Animal's Type : " + dogs.getTypeOfDog());
            } else if (animals instanceof Rabbits) {
                Rabbits rabbits = (Rabbits) animals;
                System.out.println("Animal's Type : " + rabbits.getTypeOfRabbit());
            }

           
        }
    }

    //Beginning Of Encapsulation
    public long getOwnersNumber() {
        return ownersNumber;
    }

    public void setOwnersNumber(long ownersNumber) {
        this.ownersNumber = ownersNumber;
        if (ownersNumber != 0) {
            System.out.println("Phone Number :" + ownersNumber);
        } else {
            System.out.println("Please enter your phone number !");
        }
    }

    public int getAmountOfPayment() {
        return amountOfPayment;
    }

    public void setAmountOfPayment(int amountOfPayment) {
        this.amountOfPayment = amountOfPayment;
    }
    //End Of Encapsulation

}
