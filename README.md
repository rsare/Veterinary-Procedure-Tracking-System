# Veterinary Procedures Tracking System

This is a Veterinary Procedures Tracking System that helps pet owners keep track of their pets' vaccinations and allows veterinarians to monitor the overall progress and profits. The system is built with Java and designed to facilitate the management of animals' medical records and owners' data.

Main Purpose of the Project
The main goal of this project is to help pet owners keep track of their pets' vaccinations, which are crucial for their health. Additionally, it enables veterinarians to easily calculate and track the total profit from the services provided to the animals.

-- Features
User Management:
Owners can register themselves and their pets.
Admins can view the overall profit from services and all registered users and animals.

Animal Management:
Supports various species like cats, dogs, and rabbits.
Different vaccines specific to the animal species are tracked.

Vaccination Tracking:
Owners can log vaccinations for their pets.
The system supports adding multiple vaccines of the same type for a pet, which is helpful for repeat vaccinations.

Profit Calculation:
Admins can track the total profit after owners add vaccines to their pets.


Project Structure
-- Classes

Animal Class:
Superclass for animals (e.g., Cat, Dog, Rabbit) with shared properties and methods. This structure allows for polymorphism.

Cat, Dog, Rabbit Classes:
Inherit from the Animal class, with species-specific vaccine information.

User Class:
Superclass for users (Admin and Owner). Polymorphism is applied here as well.

Admin Class:
Admins can see the total profit and access all the users and animals in the system.

Owner Class:
Owners can add new animals and assign vaccines.

Login Class:
Handles login functionality for both Admin and Owner.

Veterinary Class:
Allows owners to create new accounts and log their pets' information.

Test Class:
Contains tests to ensure the system behaves correctly under various conditions.


Rules and Usage
Initially, the system has no users. Admin can log in with the following credentials:

Username: Admin
Password: 632 admin
Owners must register themselves and their pets before accessing the system.
The system allows the same vaccine to be added multiple times for a pet.
Proper pet name input is mandatory when adding vaccines.



UML 
![image](https://github.com/user-attachments/assets/cbbba99e-dbea-4305-81f7-f0f104a80475)
