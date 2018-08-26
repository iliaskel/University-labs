package pkg02.anazitisi;


public class Student 
{
    private String name;
    private String surname;
    private short am;
    private short year;
    
    Student(String name, String surname, short am, short year)
    {
        this.name = name;
        this.surname= surname;
        this.am = am;
        this.year = year;
    }
    
    public String getSurname()
    {
        return this.surname;

    }
    
    public short getAM()
    {
        return this.am;
    }
    
   public String toString()
   {
        String str;
        str = "Name " + name + ", surname " + surname+ ", AM " + 			am + ", year" + year;
        return str;
    }
}
