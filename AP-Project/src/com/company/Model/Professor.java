package com.company.Model;

public class Professor extends User{
    private int professorID;
    private int roomNumber;
    boolean isEducationalAssistant = false;
    boolean isDeanOfTheFaculty = false;
    private String faculty;
    private String academicSide;
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
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String getFaculty() {
        return faculty;
    }

    public void setAcademicSide(String academicSide) {
        this.academicSide = academicSide;
    }

    public String getAcademicSide() {
        return academicSide;
    }
}
