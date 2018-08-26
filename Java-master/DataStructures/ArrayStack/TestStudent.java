public class TestStudent{
    public static void main(String args[]) throws StackFullException{
     
        
        
        System.out.println("Dwse to megethos ths stoivas: ");
        int megStoiv=UserInput.getInteger();
        ArrayStack.setPin(megStoiv);
        ArrayStack stoiva=new ArrayStack();
        boolean flag=true;
        int arith_mitr;
        String name;
        String last;
        double age;
        char fulo;
        int ar_ap;
        double vathmos;  
        
        
        while (flag==true){
        System.out.println("Epilogh menu");
        System.out.println("1. Epistrofh megethous");
        System.out.println("2. An einai adio");
        System.out.println("3. an o pinakas einai gematos");
        System.out.println("4. Epistrofh tou panw antikeimenou");
        System.out.println("5. Eisagwgh antikeimenou");
        System.out.println("6. Afairesh tou top antikeimenou");
        System.out.println("7. Telos");
        
        int ep=UserInput.getInteger();
        
        
        switch(ep){
            case 1:
                int meg=stoiva.size();
                System.out.println("To megethos einai: "+meg);
                break;
            case 2:
                if(stoiva.isEmpty())
                    System.out.println("H stoiva einai adeia! ");
                else
                    System.out.println("H stoiva den einai adeia! ");
                break;
            case 3:
                if(stoiva.isFull())
                    System.out.println("H stoiva einai gemath! ");
                else
                    System.out.println("H stoiva den einai gemath! ");
                break;
            case 4:
                System.out.println("To panw antikeimeno einai: ");
                System.out.println(stoiva.top());
                break;
            case 5:
                System.out.println("Dwse arithmo mitrou foithth");
                arith_mitr=UserInput.getInteger();
                System.out.println("Dwse Onoma foithth");
                name=UserInput.getString();
                System.out.println("Dwse Eponumo foithth");
                last=UserInput.getString();
                System.out.println("Dwse hlikia foithth");
                age=UserInput.getDouble();
                System.out.println("Dwse fulo foithth");
                fulo=UserInput.getChar();
                System.out.println("Dwse arithmo apousiwn foithth");
                ar_ap=UserInput.getInteger();
                System.out.println("Dwse vathmo foithth");
                vathmos=UserInput.getDouble();
                Student math=new Student(arith_mitr,name,last,age,fulo,ar_ap,vathmos);
                stoiva.push((Object)math);
                break;
            case 6:
               Object stud=stoiva.pop();
               Student stude=(Student)stud;
               System.out.println(stude); 
               break; 
            case 7:
                flag=false;
                break;
        
        }
        
        }   
        
    }
}
