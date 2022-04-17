package com.company.approject.Controller;

import com.company.approject.Model.User;

public class LoginController {
    public static User checkUsernameAndPassword(String username , String password) {
        for (User user : UserController.getUsers()) {
            if (user.getNationalID().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
