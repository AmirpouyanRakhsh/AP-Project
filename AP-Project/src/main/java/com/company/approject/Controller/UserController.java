package com.company.approject.Controller;

import com.company.approject.Model.User;

import java.util.ArrayList;

public class UserController {
    private static ArrayList<User> users = new ArrayList<User>();

    public static void addUsers(User user) {
        users.add(user);
    }

    public static ArrayList<User> getUsers() {
        return users;
    }
}
