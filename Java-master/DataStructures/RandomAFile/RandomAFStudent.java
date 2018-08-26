
import java.io.*;
public class RandomAFStudent {
    public static void main(String args[]) throws IOException{
        try{
        FileOutputStream fos = new FileOutputStream("fos.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for(int i=1; i<=19; i++){
            oos.writeObject(new Student(12000+i));
        }
        FileInputStream fis = new FileInputStream("fos.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println(ois.readObject());
        int am;
        long thesi;
        int ep = -1;
        while(ep!=0){
            System.out.println("1 - Egrafh foititi sto arxeio");
            System.out.println("2 - Diagrafi foititi apo to arxeio");
            System.out.println("3 - Parousiasi stoixeiwn foititi");
            System.out.println("4 - Enimerwsh apousiwn foititi");
            System.out.println("5 - Kataxwrisi vathmologias foititi");
            System.out.println("Eisagwgi...(1-5)");
            ep = UserInput.getInteger();
            if(ep==1){
                System.out.println("Dwse arithmo mitrwou foititi gia eisagwgh(12001-12020)");
                am = UserInput.getInteger();
                thesi = hash(am);
            }
            else if(ep==2){
                
            }
            else if(ep==3){
                
            }
            else if(ep==4){
                
            }
            else{
                
            }
        }
        }catch(IOException ex){
            System.out.println(ex.toString());
        }catch(ClassNotFoundException ex){
            System.out.println(ex.toString());
        }
    }
    
    public static long hash(int x){
        return 72*(x-12001);
    }
}
