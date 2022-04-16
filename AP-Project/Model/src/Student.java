public  abstract class  Student extends User {
    private int studentID;
    private int GPA;
    private String supervisor;
    private int enteringYear;
    private enum studentGrade{
        Undergraduate , Master , PHD
    }
    private enum status{
        Studying , Graduated , WithdrawalFromEducation
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
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
}
