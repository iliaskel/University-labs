public class Bird implements iBird{
    private int age;
    private double weigth;
    
    
    public Bird(int a,double w){
        try{
         this.age=a;
         if (a<0) throw new ArithmeticException();
        }
        catch (ArithmeticException ex){
            System.out.println("Arnhtikh timh hlikias");
        }try{
          this.weigth=w;
         if (w<0) throw new ArithmeticException();
        }
        catch (ArithmeticException ex){
            System.out.println("Arnhtikh timh hlikias");
        }
        
    }
    public String fly(){
        return "fly high";
    }
    
    public void chirp(){
        System.out.println("chirp...");
    }
    public String toString(){
        String emf="Hlikia: "+age+" Varos: "+weigth;
        return emf;
    }
}
