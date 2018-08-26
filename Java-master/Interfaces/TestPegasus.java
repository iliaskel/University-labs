public class TestPegasus {
    public static void main(String args[]){
        
        iBird Aviary[]=new iBird[4];
        for(int i=0;i<Aviary.length;i++){
            double a=Math.random();
            int b=(int)(Math.random()*10);
            double c=(Math.random()*100);
            int d=(int)(Math.random()*10);
            double e=(Math.random()*100);
            
            if(a<0.5)
                Aviary[i]=new Pegasus(b,c);
            else
                Aviary[i]=new Bird(d,e);
       }
       
       Horse Ranch[]=new Horse[4]; 
       for(int i=0;i<Ranch.length;i++){
           double a=Math.random();
            int f=(int)(Math.random()*10);
            double g=(Math.random()*100);
            int h=(int)(Math.random()*10);
            double j=(Math.random()*100);
           if(a<0.5)
               Ranch[i]=new Pegasus(f,g);
           else
               Ranch[i]=new Horse(h,j);
      }
       
      System.out.println("Tupwsh Pinaka Aviary");
      for(int i=0;i<Aviary.length;i++){
          Aviary[i].fly();
          if(Aviary[i] instanceof Bird)
            ((Bird)Aviary[i]).chirp();
          System.out.println(Aviary[i]);
      }  
      
      
      System.out.println("-----------------------------");
      System.out.println("Tupwsh Pinaka Ranch");
      
      
      for(int i=0;i<Ranch.length;i++){
          ((Horse)Ranch[i]).whinny();
          ((Horse)Ranch[i]).gallop();
          if(Ranch[i] instanceof Pegasus)
              System.out.println(((Pegasus)Ranch[i]).fly());
          System.out.println(Ranch[i]);
          
          
      }
        
    }
}
