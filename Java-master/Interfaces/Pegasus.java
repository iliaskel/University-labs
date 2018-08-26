public class Pegasus extends Horse implements iBird{

    
    
    public Pegasus(){}
    public Pegasus(int a,double b){
       super(a,b);
    }
    public String toString(){
        String emf="Hlikia: "+getAge()+" Varos: "+getWeigth();
        return emf;
    }
    
    public String fly() {
        return "chirp…";
    }
    
    
    
}
