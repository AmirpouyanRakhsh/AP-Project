package com.company.View;

import com.company.Controller.LoginController;
import com.company.Controller.UserController;
import com.company.Model.DeanOfTheFaculty;
import com.company.Model.EducationalAssistant;
import com.company.Model.Student;
import com.company.Model.User;

import java.util.Scanner;

public class LoginMenu {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        User logedUser = LoginController.checkUsernameAndPassword(username, password);
        if (logedUser == null) {
            System.out.println("erro");
        }else{
           if(logedUser instanceof Student){
               System.out.println("you are student");
               for (User user : UserController.getUsers()) {
                   System.out.println(user);
               }
           }
           else if(logedUser instanceof EducationalAssistant){
               System.out.println(" you are educatinal assistant");
               for (User user : UserController.getUsers()) {
                   System.out.println(user);
               }
           }else if(logedUser instanceof DeanOfTheFaculty)
               System.out.println("you are dean of the faculty");
        }
    }
}
