package pkg04.ta3inomisi;


public class Foititis {
    
    private String name;
    String epwnymo;
    short am;
    short etos;
    
    Foititis(String name, String epwnymo){
        this.name = name;
        this.epwnymo = epwnymo;
        this.am = 0;
        this.etos = 0;
    }
    
    public String getEpwnymo(){
        return this.epwnymo;

    }
    
    public short getAM(){
        return this.am;
    }
    
    public short getEtos(){
        return this.etos;
    }
    
    public void setEtos(Short etos){
        this.etos=etos;
    }
    
    public void setAM(Short am){
        this.am=am;
    }
    
    public String toString(){
        String str;
        str = "onoma: " + name + " epwnymo: " + epwnymo + " AM: " + am + " etos eisagwghs: " + etos;
        return str;
    }
}
