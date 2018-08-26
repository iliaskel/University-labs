package pkg02.anazitisi;


public class TestMyUtils 
{

    public static void main(String[] args) 
    {
        Student[] array = new Student[10];
        array [0] = new Student("nikos", "nikas", (short)10123, (short)2013);
        array [1] = new Student("tolis", "tolis", (short)10124, (short)2013);
        array [2] = new Student("giorgos", "gergiou", (short)10125, (short)2013);
        array [3] = new Student("alexis", "alexiou", (short)10126, (short)2013);
        array [4] = new Student("stelios", "steliou", (short)10127, (short)2013);
        array [5] = new Student("rafa", "rafail", (short)10128, (short)2013);
        array [6] = new Student("george", "nikolaou", (short)10129, (short)2013);
        array [7] = new Student("nikos", "papas", (short)10130, (short)2013);
        array [8] = new Student("stelios", "steliou", (short)10131, (short)2013);
        array [9] = new Student("giannis", "iwannou", (short)10132, (short)2013);
        
        for(int i=0; i<10; i++)
            System.out.println(array [i]);

        System.out.println("Input surname to search: ");
        String lname = UserInput.getString();
        System.out.println("Input am to search: ");
        short ar = UserInput.getShort();
        int left = 0;
        int right = pin.length-1;
        System.out.println(MyUtils.SearchAM(array, ar, left, right));
        
        System.out.println(MyUtils.SearchSurname(lname, array));
    }
}


