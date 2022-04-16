package com.company.Controller;

import com.company.Model.User;

public class DeanOfTheFacultyController {
    public static void addUser(String firsName , String lastName , String nationalID , String phoneNumber , String faculty){
        User user = new User();
        user.setFirstName(firsName);
        user.setLastName(lastName);
        user.setNationalID(nationalID);
        user.setPhoneNumber(phoneNumber);
        user.setFaculty(faculty);
        UserController.addUsers(user);
    }
}
