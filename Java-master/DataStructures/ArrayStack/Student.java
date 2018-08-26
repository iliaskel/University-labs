public class Student {
    
    private int arith_mitr;
    private String name;
    private String last;
    private double age;
    private char fulo;
    private int ar_ap;
    private double vathmos;
    
    
    
    public Student(){}
    
    public Student(int am,String onoma, String epitheto, double hlikia, char ful,int arith_ap,double v){
        this.arith_mitr=am;
        this.name=onoma;
        this.last=epitheto;
        this.age=hlikia;
        this.fulo=ful;
        this.ar_ap=arith_ap;
        this.vathmos=v;
    }
    
     public void setArith_mitr(int a){
        this.arith_mitr=a;
    }
     
     public void setName(String a){
         this.name=a;
     }
     
     public void setLast(String a){
         this.last=a;
     }
     
     public void setAge(double a){
         this.age=a;
     }
     
     public void setFulo(char a){
         this.fulo=a;
     }

     public void setAr_ap(int a){
         this.ar_ap=a;
         
     }
     public void setVathmos(double a){
         this.vathmos=a;
        
     }
     
     public int getArith_mitr(){
        return arith_mitr;
    }
     
     public String getName(){
         return name;
     }
     
     public String getLast(){
         return last;
     }
     
     public double getAge(){
         return age;
     }
     
     public char getFulo(){
         return fulo;
     }

     public int getAr_ap(){
         return ar_ap;
         
     }
     public double getVathmos(){
         return vathmos;
        
     }
     
    public String toString(){
    return "arith_mitr "+arith_mitr+" onoma: "+name+" epomuno: "+last+" hlikia: "+age+" fulo: "+fulo+" arithmos apousiwn: "+ar_ap+" vathmos: "+vathmos;
    
}
     
     
     
     
     
}
