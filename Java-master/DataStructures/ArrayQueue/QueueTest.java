package erg03;

public class QueueTest {
    public static void main(String[] args){
        System.out.println("Dwse to megethos tis ouras");
        int megethos = UserInput.getInteger();
        ArrayQueue q1 = new ArrayQueue(megethos);
        int epilogi = 0;
        while(epilogi!=4){
        System.out.println("Gia eisagwgi stin oura : 1");
        System.out.println("Gia afairesi apo tin oura : 2");
        System.out.println("Gia emfanisi tou prwtou stoixeiou : 3");
        System.out.println("Gia termatismo : 4");
        epilogi = UserInput.getInteger();
        
        if(epilogi==1){
            System.out.println("Dwse arithmo mitrwou foititi");
            int AM = UserInput.getInteger();
            System.out.println("Dwse Onoma foititi");
            String Fname = UserInput.getString();
            System.out.println("Dwse Epwnymo foititi");
            String Lname = UserInput.getString();
            System.out.println("Dwse Ilikia");
            double age = UserInput.getDouble();
            System.out.println("Dwse Fylo");
            char S = UserInput.getChar();
            System.out.println("Dwse apousies");
            int apousies = UserInput.getInteger();
            System.out.println("Dwse Vathmo");
            double vathmos = UserInput.getDouble();
            Student math = new Student(AM, Fname, Lname, age, S, apousies, vathmos);
            q1.enqueue((Object)math);
        }
        
        if(epilogi==2) q1.dequeue();
        if(epilogi==3) System.out.println(q1.front());
        if(epilogi==4){
            System.out.println("Termatismos...");
            break;
            }        
        }
    }
}
