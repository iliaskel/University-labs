

package pkg06.genikeush.polumorfismos;

public class Truck extends Vehicle{
    int a3ones;
    
    Truck(String idioktitis, String arKykloforias, int a3ones){
        super(idioktitis, arKykloforias);
        this.a3ones=a3ones;
    }
    
    public void drive(){
        System.out.println("You must be a professional driver. This is a " + a3ones + "truck Mr." + getidioktitis());
    }
    
}
