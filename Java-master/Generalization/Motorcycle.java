

package pkg06.genikeush.polumorfismos;


public class Motorcycle extends Vehicle {
   boolean kala8i; 
    
    Motorcycle(String idioktitis, String arKykloforias, boolean kala8i){
        super(idioktitis, arKykloforias);
        this.kala8i=kala8i;
    }
    
    public void drive(){
        System.out.println("Your car driving license is not enough. You need a special license dear " + getidioktitis());
    }
}
