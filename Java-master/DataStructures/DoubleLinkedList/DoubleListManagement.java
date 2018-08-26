public class DoubleListManagement {
    public static void main(String[] args) throws NoSuchListPosition{
        DoubleLinkedList dl = new DoubleLinkedList();
        int epilogi = 1;
        while(epilogi!=0){
        System.out.println("1- INSERT ELEMENT AT THE BEGINNING OF THE LIST");
        System.out.println("2- INSERT ELEMENT AT THE END OF THE LIST");
        System.out.println("3- INSERT ELEMENT AT POSITION N OF THE LIST");
        System.out.println("4- DELETE ELEMENT FROM THE BEGINNING OF THE LIST");
        System.out.println("5- DELETE ELEMENT FROM THE END OF THE LIST");
        System.out.println("6- DELETE ELEMENT FROM POSITION N OF THE LIST");
        System.out.println("7- LIST LENGTH");
        System.out.println("8- IS THE LIST EMPTY");
        System.out.println("9- PRINT LIST");
        System.out.println("0- EXIT");
        System.out.println("INPUT YOUR CHOICE(0-9)");
        epilogi = UserInput.getInteger();
        
        if(epilogi==1){
           System.out.println("Dwse ena string gia eisagwgh stin arxi tis listas : ");
           String str = UserInput.getString();
           dl.insertF((String)str);
        }
        if(epilogi==2){
           System.out.println("Dwse ena string gia eisagwgh sto telos tis listas : ");
           String str = UserInput.getString();
           dl.insertLast((String)str);
        }
        if(epilogi==3){
           System.out.println("Dwse tin thesi stin opoia theleis na ginei eisagwgi : ");
           int thesi = UserInput.getInteger();
           System.out.println("Dwse ena string gia eisagwgh stin " +thesi+ "h thesi tis listas : ");
           String str = UserInput.getString();
           dl.insert(thesi, (String)str);
        }
        if(epilogi==4){
            System.out.println("Diagrafh stoixeiou apo tin arxi tis listas...");
            dl.removeFirst();
        }
        if(epilogi==5){
            System.out.println("Diagrafh stoixeiou apo to telos tis listas...");
            dl.removeLast();
        }
        if(epilogi==6){
            System.out.println("Dwse tin thesi stin opoia theleis na ginei diagrafi : ");
            int thesi = UserInput.getInteger();
            System.out.println("Diagrafi stoixeiou apo tin "+thesi+"h thesi tis listas...");
            dl.remove(thesi);
        }
        if(epilogi==7)
            System.out.println("To megethos tis listas einai : " + dl.size());
        
        if(epilogi==8)
            System.out.println(dl.isEmpty());
        
        if(epilogi==9)
            dl.printList();
        
        if(epilogi==0){
            System.out.println("Termatismos...");
            break; 
          }
        }   
    }
}
