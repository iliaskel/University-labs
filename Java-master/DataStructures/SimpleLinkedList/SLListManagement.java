public class SLListManagement {
    public static void main(String[] args){
    SimpleLinkedList s1 = new SimpleLinkedList();
    int epilogi = 0;
    while(epilogi!=8){
        System.out.println("1 - INSERT ELEMENT AT THE BEGINNING OF THE LIST");
        System.out.println("2 - INSERT ELEMENT AT THE END OF THE LIST");
        System.out.println("3 - DELETE FROM THE BEGGINING OF THE LIST");
        System.out.println("4 - DELETE FROM THE END OF THE LIST");
        System.out.println("5 - LIST LENGTH");
        System.out.println("6 - IS THE LIST EMPTY");
        System.out.println("7 - PRINT LIST");
        System.out.println("8 - EXIT");
        System.out.println("INPUT YOUR CHOICE");
        epilogi = UserInput.getInteger();
        
        if(epilogi==1){
            System.out.println("Eisigage ena string");
            String sf = UserInput.getString();
            s1.insertFirst((Object)sf);
        }
        
        if(epilogi==2){
            System.out.println("Eisigage ena string");
            String sl = UserInput.getString();
            s1.insertLast((Object)sl);
        }
        
        if(epilogi==3){
            System.out.println("Ginetai afairesi string apo tn arxi..."+s1.removeFirst());
            System.out.println();
        }
        
        if(epilogi==4){
            System.out.println("Ginetai afairesi string apo to telos..."+s1.removeLast());
            System.out.println();
            
        }
        
        if(epilogi==5){
            System.out.println("To megethos tis listas einai : ");
            System.out.print(s1.size());
            System.out.println("\n");
        }
        
        if(epilogi==6){
            if(s1.isEmpty())
                System.out.println("H lista einai adeia");
            else
                System.out.println("H lista den einai adeia");
        }
        
        if(epilogi==7){
            System.out.println("Ektupwsi listas...");
            s1.printList();
        }
        
        if(epilogi==8){
            System.out.println("Exiting...");
            break;
        }
    }
  }
}
