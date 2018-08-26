

package pkg06.genikeush.polumorfismos;


public abstract class Vehicle {
    private String idioktitis;
    private String arKykloforias;
 //   private int etosKat;
    
    public Vehicle(String idioktitis, String arKykloforias){
        this.idioktitis=idioktitis;
    //    this.etosKat=etosKat;
        this.arKykloforias=arKykloforias;
    }

    public void transferOwnership(String idioktitis){
        this.idioktitis=idioktitis;
        System.out.println("Ownership is transferred to" + idioktitis);
    } 
    
    public void setarKykloforias(String arKykloforias){
        this.arKykloforias=arKykloforias;
    }
    
 
    public String getidioktitis(){
        return idioktitis;
    }
    
 //   public int getetosKat(){
  //      return etosKat;
 //   }
    
    public String toString(){
        return (idioktitis+ " "+  arKykloforias);
    }
}    
    

