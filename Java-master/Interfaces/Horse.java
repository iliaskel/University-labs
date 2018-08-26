public class Horse {
    private int age;
    private double weigth;
    
    public Horse(){}
    public Horse(int a,double w){
        try{
         this.age=a;
         if (a<0) throw new ArithmeticException();
        }
        catch (ArithmeticException ex){
            System.out.println("Arnhtikh timh hlikias");
        }
        
        try{
          this.weigth=w;
            if (w<0) throw new ArithmeticException();
        }
        catch (ArithmeticException ex){
            System.out.println("Arnhtikh timh hlikias");
        }
    }
    
    public void whinny(){
        System.out.println("whinny");
    }
    public void gallop(){
        System.out.println("travel fast");
    }
    
    public void setWeight(double a){
        this.weigth=a;
    }
    public void setAge(int a){
        this.age=a;
    }
    
    public String toString(){
        String emf="Hlikia: "+age+" Varos: "+weigth;
        return emf;
    }
    
    public int getAge(){
        return age;
    }
    
    public double getWeigth(){
        return weigth;
    }
    
}
