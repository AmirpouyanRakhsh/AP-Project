package com.company.View;

import com.company.Controller.EducationalAssistantController;
import com.company.Controller.UserController;
import com.company.Model.User;

import java.util.Scanner;

public class DeanOfTheFacultymenu {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if (str.startsWith("new user")) {
                String[] args = str.split(" ");
                EducationalAssistantController.addUser(args[2], args[3], args[4], args[5], args[6]);
            }
            else if(str.startsWith("show users")){
                for (User user : UserController.getUsers()) {
                    System.out.println(user);
                }
            }
        }
    }
}
