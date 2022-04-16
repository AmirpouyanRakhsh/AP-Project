package com.company.Controller;

import com.company.Model.User;

import java.util.ArrayList;

public class UserController {
    private static ArrayList<User> users = new ArrayList<User>();
    public static void addUsers(User user){
        users.add(user);
    }
    public static ArrayList<User> getUsers(){
        return users;

    }
}
