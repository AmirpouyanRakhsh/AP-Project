package com.company;

import com.company.Controller.UserController;
import com.company.Model.DeanOfTheFaculty;
import com.company.Model.EducationalAssistant;
import com.company.Model.Student;
import com.company.View.EducationalAssistantMenu;
import com.company.View.LoginMenu;

public class Main {

    public static void main(String[] args) {
//        Student student = new Student();
//        student.setStudentID("123");
//        student.setPassword("123");
//        UserController.addUsers(student);
//        EducationalAssistant educationalAssistant = new EducationalAssistant();
//        educationalAssistant.setNationalID("123");
//        educationalAssistant.setPassword("123");
//        DeanOfTheFaculty deanOfTheFaculty = new DeanOfTheFaculty();
//        deanOfTheFaculty.setNationalID("123");
//        deanOfTheFaculty.setPassword("123");
//        LoginMenu loginMenu = new LoginMenu();
//        loginMenu.run();

        EducationalAssistant educationalAssistant = new EducationalAssistant();
        educationalAssistant.setNationalID("414");
        educationalAssistant.setPassword("123");
        UserController.addUsers(educationalAssistant);
//        EducationalAssistantMenu menu = new EducationalAssistantMenu();
//        menu.run();
        LoginMenu loginMenu = new LoginMenu();
        loginMenu.run();
//        EducationalAssistantMenu educationalAssistantMenu = new EducationalAssistantMenu();
//        educationalAssistantMenu.run();
//


    }
}
