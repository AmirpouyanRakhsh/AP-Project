package com.company.approject.Model;

public class Professor extends User{
    private int professorID;
    private int roomNumber;
    boolean isEducationalAssistant = false;
    boolean isDeanOfTheFaculty = false;
    Faculty faculty;
    private enum professorGrade{
        AssistantProfessor , AssociateProfessor , FullProfessor
    }

    public void setProfessorID(int professorID) {
        this.professorID = professorID;
    }

    public int getProfessorID() {
        return professorID;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public Faculty getFaculty() {
        return faculty;
    }

}

