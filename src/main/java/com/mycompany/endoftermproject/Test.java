package com.mycompany.endoftermproject;

import java.util.Scanner;

/**
 *
 * @author Sare
 */
public class Test {

    Login login = new Login();

    public static void main(String[] args) {

        Admin admin = new Admin();
                
        admin.setUserName("Admin");
        admin.setPassword("632");
        Veterinary.users.add(admin);

        Test test = new Test();
        test.View();
    }

    void View() {
        Scanner scan = new Scanner(System.in);
        String userName, password;
        int number;

        System.out.println("\n\nWhat do you want to log in as ?");
        System.out.println("""
                           1) Login as Admin
                           2) Login as Owner
                           3) Register as Owner
                           """);
        System.out.print("\n\nEnter Your Selection : ");
        number = scan.nextInt();

        switch (number) {
            case 1:
                System.out.print("\nUsername : ");
                userName = scan.nextLine();
                userName = scan.nextLine();
                System.out.print("Password : ");
                password = scan.nextLine();

                Admin admin = login.verificationAdmin(userName, password);
                if (admin == null) {
                    System.out.println("\n\n !!! You Login Wrong, Please Try Again !!!");
                    View();
                }
                while (admin != null) {
                    System.out.println("-------------WELCOME TO THE VETERINARY SYSTEM-------------");
                    System.out.println("""
                                       
                                       
                                       1) Click 1 to See Owners and Pets
                                       2) Click 2 to See Your Total Profit
                                       3) Click 3 to Log Out
                                       """);
                    System.out.print("Please choose your selection : ");
                    number = scan.nextInt();
                    switch (number) {
                        case 1:
                            int ownerCount = 0;
                            for (Users user : Veterinary.users) {
                                if(ownerCount == 0){
                                    System.out.println("You don't have any owners and pets !!!");
                                }
                                if (user instanceof Owners) {
                                    Owners owner = (Owners) user;
                                    if (!owner.animals.isEmpty()) {
                                        System.out.println("\n\nAll Owners and Pets :");
                                        admin.showAll();
                                    } else {
                                        System.out.println("\n\nYou don't have any owners !!!");
                                        
                                    }
                                }

                            }
                            continue;

                        case 2:
                            System.out.print("\n\nTotal Profit : ");
                            System.out.println(admin.getTotalProfit());
                            continue;
                        case 3:
                            System.out.println("\n\nLogging out the system...");
                            View();
                        default:
                    }

                }
            case 2:
                System.out.print("\nUsername : ");
                userName = scan.nextLine();
                userName = scan.nextLine();
                System.out.print("Password : ");
                password = scan.nextLine();
                Owners owner = login.verificationOwners(userName, password);
                if (owner == null) {
                    System.out.println(" !!! You Login Wrong, Please Try Again !!!");
                    View();
                }
                while (owner != null) {
                    System.out.println("-------------WELCOME TO THE VETERINARY SYSTEM-------------");
                    System.out.println("""
                                       
                                                   1) Click 1 to Add Your Cat 
                                                   2) Click 2 to Add Your Dog
                                                   3) Click 3 to Add Your Rabbit
                                                   4) Click 4 to See Your All Animals and Add Vaccine
                                                   5) Click 5 to Log Out
                                                   """);
                    System.out.print("\nPlease choose your selection : ");
                    number = scan.nextInt();
                    switch (number) {
                        case 1:
                            System.out.print("\n\nPlease enter your animal's name : ");
                            String name = scan.nextLine();
                            name = scan.nextLine();
                            System.out.print("Please enter your animal's id : ");
                            int id = scan.nextInt();
                            System.out.print("Please enter your animal's age : ");
                            int age = scan.nextInt();
                            System.out.print("Please enter your animal's gender : ");
                            String gender = scan.nextLine();
                            gender = scan.nextLine();
                            System.out.print("Please select your animal's type");
                            System.out.println("""
                                                  
                                               
                                               1) Scotish Fold
                                               2) Sfenks
                                               3) Tabby
                                               """);

                            System.out.print("\nPlease choose your selection : ");
                            int typeOfCat = scan.nextInt();
                            System.out.print("Please enter your animal's owner's name and surname : ");
                            String infoOfOwner = scan.nextLine();
                            infoOfOwner = scan.nextLine();
                            owner.addCats(name, id, age, gender, typeOfCat - 1, infoOfOwner);
                            continue;
                        case 2:
                            System.out.print("\n\nPlease enter your animal's name : ");
                            String dogName = scan.nextLine();
                            dogName = scan.nextLine();
                            System.out.print("Please enter your animal's id : ");
                            int dogId = scan.nextInt();
                            System.out.print("Please enter your animal's age : ");
                            int dogAge = scan.nextInt();
                            System.out.print("Please enter your animal's gender : ");
                            String dogGender = scan.nextLine();
                            dogGender = scan.nextLine();
                            System.out.print("Please select your animal's type");
                            System.out.println("""
                                               
                                               
                                               1) Pitbull
                                               2) Akita Dog
                                               3) Rottweiler
                                               """);
                            System.out.print("\nPlease choose your selection : ");
                            int typeOfDog = scan.nextInt();
                           // typeOfDog = scan.nextInt();
                            System.out.print("Please enter your animal's owner's name and surname : ");
                            String dogInfoOfOwner = scan.nextLine();
                            infoOfOwner = scan.nextLine();
                            owner.addDogs(dogName, dogId, dogAge, dogGender, typeOfDog - 1, dogInfoOfOwner);
                            continue;
                        case 3:
                            System.out.print("\n\nPlease enter your animal's name : ");
                            String rabbitName = scan.nextLine();
                            rabbitName = scan.nextLine();
                            System.out.print("Please enter your animal's id : ");
                            int rabbitId = scan.nextInt();
                            System.out.print("Please enter your animal's age : ");
                            int rabbitAge = scan.nextInt();
                            System.out.print("Please enter your animal's gender : ");
                            String rabbitGender = scan.nextLine();
                            rabbitGender = scan.nextLine();
                            System.out.print("Please select your animal's type");
                            System.out.println("""
                                               
                                               
                                               1) Rex Rabbit
                                               2) Holland Lop
                                               3) Hothot Rabbit
                                               """);
                            System.out.print("\nPlease choose your selection : ");
                            //number = scan.nextInt();
                            int typeOfRabbit = scan.nextInt();
                            //typeOfRabbit = scan.nextInt();
                            System.out.print("Please enter your animal's owner's name and surname : ");
                            String rabbitInfoOfOwner = scan.nextLine();
                            infoOfOwner = scan.nextLine();
                            owner.addRabbits(rabbitName, rabbitId, rabbitAge, rabbitGender, typeOfRabbit - 1, rabbitInfoOfOwner);
                            continue;
                        case 4:
                            owner.showTheAnimals();
                            System.out.println("""
                                               
                                               1) Click 1 to Add New Vacc For Your Animal
                                               2) Turn Back 
                                               """);
                            System.out.print("\nPlease choose your selection : ");
                            number = scan.nextInt();
                            switch (number) {
                                case 1:
                                    System.out.println("\nPlease enter your pet name");
                                    System.out.print("\n\nYour pet's name : ");
                                    String animalName = scan.nextLine();
                                    animalName = scan.nextLine();
                                    for (Animals animal : owner.animals) {
                                        if (animal.getName().equals(animalName)) {
                                            if (animal instanceof Cats) {
                                                Cats cat = (Cats) animal;
                                                System.out.println("""
                                                               
                                                                   
                                                               1) Click 1 to Add Mixed Vaccine
                                                               2) Click 2 to Add Leukemia Vaccine
                                                               3) Click 3 to Add Rabies
                                                               """);

                                                System.out.print("\nPlease choose your selection : ");
                                                number = scan.nextInt();
                                                cat.setVacc(number);
                                            } else if (animal instanceof Dogs) {
                                                Dogs dog = (Dogs) animal;
                                                System.out.println("""
                                                               
                                                                   
                                                               1) Click 1 to Add Canine Hepatitis
                                                               2) Click 2 to Add Dirofilariasis
                                                               3) Click 3 to Add Rabies
                                                               """);
                                                System.out.print("\nPlease choose your selection : ");
                                                number = scan.nextInt();
                                                dog.setVacc(number);
                                            } else if (animal instanceof Rabbits) {
                                                Rabbits rabbit = (Rabbits) animal;
                                                System.out.println("""
                                                               
                                                                   
                                                               1) Click 1 to Add Myxomatosist
                                                               2) Click 2 to Add VHS
                                                               3) Click 3 to Add Rabies
                                                               """);
                                                System.out.print("\nPlease choose your selection : ");
                                                number = scan.nextInt();
                                                rabbit.setVacc(number);

                                            }

                                        }else{
                                            System.out.println("""
                                                               
                                                               !!! You entered incorrectly or incompletely, please try again !!!
                                                               
                                                               You Are Redirected To The Login Page...
                                                               
                                                               """);
                                            
                                        }
                                    }
                                    continue;
                                case 2:
                                    System.out.println("Turning back...");
                                    continue;

                            }
                        case 5:
                            System.out.println("Logging out the system...");
                            View();

                    }
                }
            case 3:
                System.out.print("\n\nPlease enter your name : ");
                String firstName = scan.nextLine();
                firstName = scan.nextLine();
                System.out.print("Please enter your last name : ");
                String lastName = scan.nextLine();
                System.out.print("Please enter your username : ");
                String userName1 = scan.nextLine();
                System.out.print("Please enter your password : ");
                String password1 = scan.nextLine();
                System.out.print("Please enter your phone number : ");
                long ownersNumber = scan.nextLong();
                Veterinary.createOwner(firstName, lastName, userName1, password1, ownersNumber);
                View();

        }
    }
}
