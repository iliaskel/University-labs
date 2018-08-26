

package pkg06.genikeush.polumorfismos;

public class Car extends Vehicle {
    int thires;
    
    Car(String idioktitis, String arKykloforias, int thires){
        super(idioktitis, arKykloforias);
        this.thires=thires;        
    }
    
    
    
    public void drive(){
        System.out.println("You need a car driving license dear" + getidioktitis());
    }
    
}
