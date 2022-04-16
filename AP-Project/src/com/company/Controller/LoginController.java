package com.company.Controller;

import com.company.Model.User;

public class LoginController {
    public static User checkUsernameAndPassword(String username , String password){
        for (User user : UserController.getUsers()) {
            if(user.getNationalID().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
}
