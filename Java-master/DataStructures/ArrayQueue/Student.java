package erg03;

public class Student {
    private int AM;
    private String Fname;
    private String Lname;
    private double age;
    private char S;
    private int apousies;
    private double vathmos;
    
    Student(){
        
    }
    
    Student(int AM, String Fname, String Lname, double age, char S, int apousies, double vathmos){
        this.AM=AM;
        this.Fname=Fname;
        this.Lname=Lname;
        this.age=age;
        this.S=S;
        this.apousies=apousies;
        this.vathmos=vathmos;
    }
    
    public int getAM(){
        return AM;
    }
    
    public String getFname(){
        return Fname;
    }
    
    public String getLname(){
        return Lname;
    }
    
    public double getAge(){
        return age;
    }
    
    public char getS(){
        return S;
    }
    
    public int getApousies(){
        return apousies;
    }
    
    public double getVathmos(){
        return vathmos;
    }
    
    public void setAM(int AM){
        this.AM=AM;
    }
    
    public void setFname(String Fname){
        this.Fname=Fname;
    }
    
    public void setLname(String Lname){
        this.Lname=Lname;
    }
    
    public void setAge(int age){
        this.age=age;
    }
    
    public void setS(char S){
        this.S=S;
    }
    
    public void setApousies(int apousies){
        this.apousies=apousies;
    }
    
    public void setVathmos(double vathmos){
        this.vathmos=vathmos;
    }
    
    public String toString(){
        return("AM : " + AM + " Fname : "+ Fname +" Lname : "+ Lname + " Age : " + age + " Sex : "+S+" Apousies : "+ apousies+" Vathmos : "+vathmos );
    }
    
}
