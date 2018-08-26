package pkg06.genikeush.polumorfismos;
import java.util.Scanner;
import java.util.Random;
public class TestVehicle {

    
    public static void main(String[] args) {
      int N;
        String AK;
        String OI;
        int ar_thur;
        boolean endiksi;
        int ar_aks;
        Scanner keyboard=new Scanner(System.in);
        if(args.length!=0)
           N=Integer.parseInt(args[0]);
        else{
            System.out.println("Dwse arithmo oxhmatwn: ");
            N=keyboard.nextInt();
        }
       Random rnd = new Random();
       int y = rnd.nextInt(16)+5;
       System.out.println("------TO RND EINAI " + y);
        Vehicle[] pin=new Vehicle[N];
        for(int i=0;i<pin.length;i++){
            double x=Math.random();
            System.out.println("Arthmo kukloforias: ");
            AK=keyboard.next();
            System.out.println("Dwse onoma idiokthth: ");
            OI=keyboard.next();
            if(x<0.8){
                System.out.println("Dwse arithmo thurwn gia to amaksi: ");
                ar_thur=keyboard.nextInt();
                pin[i]=new Car(OI, AK, ar_thur);
            }
            else if(x<0.9){
                System.out.println("Dwse true an exei kalathi, false an den exei kalathi: ");
                endiksi=keyboard.hasNextBoolean();
                pin[i]=new Motorcycle(OI,AK,endiksi);
            }
            else{ 
                    System.out.println("Dose arithmo aksonwn gia to truck: ");
                    ar_aks=keyboard.nextInt();
                    pin[i]=new Truck(OI,AK,ar_aks);
            }     
        } 
    }
    
}
