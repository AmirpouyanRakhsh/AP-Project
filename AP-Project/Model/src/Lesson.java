public class Lesson {
    private String name;
    private int courseNumber;
    private String faculty;
    private String Prerequisites;
    private String theNeed;
    private int numberOfUnits;
    private String professorName;
    private int courseAverage;
    private int numberOfRejectedStudents;
    private int numberOfAcceptedStudents;
    private int courseAverageWithOutRejectedStudents;
    public enum courseGrade{
        Undergraduate , Master , PHD
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setPrerequisites(String prerequisites) {
        Prerequisites = prerequisites;
    }

    public String getPrerequisites() {
        return Prerequisites;
    }

    public void setTheNeed(String theNeed) {
        this.theNeed = theNeed;
    }

    public String getTheNeed() {
        return theNeed;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setCourseAverage(int courseAverage) {
        this.courseAverage = courseAverage;
    }

    public int getCourseAverage() {
        return courseAverage;
    }

    public void setNumberOfRejectedStudents(int numberOfRejectedStudents) {
        this.numberOfRejectedStudents = numberOfRejectedStudents;
    }

    public int getNumberOfRejectedStudents() {
        return numberOfRejectedStudents;
    }

    public void setNumberOfAcceptedStudents(int numberOfAcceptedStudents) {
        this.numberOfAcceptedStudents = numberOfAcceptedStudents;
    }

    public int getNumberOfAcceptedStudents() {
        return numberOfAcceptedStudents;
    }

    public void setCourseAverageWithOutRejectedStudents(int courseAverageWithOutRejectedStudents) {
        this.courseAverageWithOutRejectedStudents = courseAverageWithOutRejectedStudents;
    }

    public int getCourseAverageWithOutRejectedStudents() {
        return courseAverageWithOutRejectedStudents;
    }
}
