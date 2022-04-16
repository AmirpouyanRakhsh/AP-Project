package com.company.Model;

public   class  Student extends User {
    private String studentID;
    private int GPA;
    private String supervisor;
    private int enteringYear;
    private int acceptedUnits;
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public int getGPA() {
        return GPA;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setEnteringYear(int enteringYear) {
        this.enteringYear = enteringYear;
    }

    public int getEnteringYear() {
        return enteringYear;
    }

    public void setAcceptedUnits(int acceptedUnits) {
        this.acceptedUnits = acceptedUnits;
    }

    public int getAcceptedUnits() {
        return acceptedUnits;
    }
}
