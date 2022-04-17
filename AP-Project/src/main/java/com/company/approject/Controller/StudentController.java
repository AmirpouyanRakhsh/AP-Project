package com.company.approject.Controller;

import com.company.approject.Model.Faculty;
import com.company.approject.Model.User;

public class StudentController {
    public static void addUser(String firsName, String lastName, String nationalID, String phoneNumber, Faculty faculty) {
        User user = new User();
        user.setFirstName(firsName);
        user.setLastName(lastName);
        user.setNationalID(nationalID);
        user.setPhoneNumber(phoneNumber);
        user.setFaculty(faculty);
        UserController.addUsers(user);
    }
}
