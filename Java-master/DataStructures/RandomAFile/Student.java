import java.io.*;
public class Student implements Serializable{
// PRIVATE INSTANCE FIELDS
    private int am;
    private String lastName;
    private String firstName;
    private int absences;
    private float grade;
    
    public Student() {
        this(0,"", "");
    }
    
    public Student(int am,String lName,String fName) {
        this.am = am;
        firstName = fName;
        lastName = lName;
        absences = 0;
        grade = 0.0f;
    }
    
    public Student(int am){
        this.am = am;
        this.lastName="               ";
        this.firstName="               ";
        this.absences=-1;
        this.grade=-1f;
    }
    
    public Student(int am, String lastName, String firstName, int absences, float grade){
        this.am = am;
        this.lastName=lastName;
        this.firstName=lastName;
        this.absences=absences;
        this.grade=grade;
    }
    
    public int getAm() {
        return am;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getAbsences() {
        return absences;
    }
    public float getGrade() {
        return grade;
    }
    public void setAbsences(int a) {
        absences = a;
    }
    public void setGrade(float g) {
        grade = g;
    }
    public String toString() {
        String s;
        s = "AM: " + am + "\nlastName: "+lastName+"\nfirstname: "+firstName+"\nApousies: "+absences+"\nVathmos: "+grade;
        return s;
    }
}