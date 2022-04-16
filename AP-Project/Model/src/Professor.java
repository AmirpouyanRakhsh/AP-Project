public class Professor extends User{
    private int professorID;
    private int roomNumber;
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
}
