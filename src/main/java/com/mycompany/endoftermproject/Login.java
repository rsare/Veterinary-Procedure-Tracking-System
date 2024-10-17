package com.mycompany.endoftermproject;

import static com.mycompany.endoftermproject.Veterinary.users;

/**
 *
 * @author Sare
 */
public class Login {

    public Admin verificationAdmin(String userName, String password) {
        for (Users user : Veterinary.users) {
            if (user instanceof Admin) {
                Admin admin = (Admin) user;
                if (userName.equals(admin.getUserName()) && password.equals(admin.getPassword())) {
                    return admin;
                }
            }

        }
        return null;
    }

    public Owners verificationOwners(String userName, String password) {
        for (Users user : Veterinary.users) {
            if (user instanceof Owners) {
                Owners owner = (Owners) user;
                if (userName.equals(owner.getUserName()) && password.equals(owner.getPassword())) {
                    return owner;
                }
            }

        }
        return null;
    }

}
