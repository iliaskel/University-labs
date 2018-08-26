/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.ta3inomisi;




public class TestSortUtils {

    public static void main(String[] args) {
  //      Foititis[] pin = new Foititis[10];
  //      pin[0] = new Foititis("nikos", "nikas", (short)10123, (short)2013);
  //      pin[1] = new Foititis("tolis", "tolis", (short)10124, (short)2013);
  //      pin[2] = new Foititis("giorgos", "gergiou", (short)10125, (short)2013);
  //      pin[3] = new Foititis("alexis", "alexiou", (short)10126, (short)2013);
  //      pin[4] = new Foititis("stelios", "steliou", (short)10127, (short)2013);
   //     pin[5] = new Foititis("rafa", "rafail", (short)10128, (short)2013);
   //     pin[6] = new Foititis("george", "nikolaou", (short)10129, (short)2013);
   //     pin[7] = new Foititis("nikos", "papas", (short)10130, (short)2013);
   //     pin[8] = new Foititis("stelios", "steliou", (short)10131, (short)2013);
   //     pin[9] = new Foititis("giannis", "iwannou", (short)10132, (short)2013);
        
   //     for(int i=0; i<10; i++)
     //       System.out.println(pin[i]);
      //  System.out.println("dwse ena epwnymo");
      //  String lname = UserInput.getString();
   //     System.out.println("dwse ena am");
  //      short ar = UserInput.getShort();
  //      int left = 0;
  //      int right = pin.length-1;
  //      System.out.println(MyUtils.anazitisiMeArMitrwou(pin, ar, left, right));
        
   //     System.out.println(MyUtils.anazitisiMeEpwnymo(lname, pin));
        
        
        Foititis p[] = new Foititis[7];
        p[0] = new Foititis("alekos", "alexandrou");
        p[1] = new Foititis("nikos", "nikou");
        p[2] = new Foititis("thomas", "rafail");
        p[3] = new Foititis("jim", "dimitriou");
        p[4] = new Foititis("giorgos", "gewrgiou");
        p[5] = new Foititis("stelios", "stilianos");
        p[6] = new Foititis("ilias", "antwniou");
        short etos;
        for(int i=0; i<p.length; i++){
            System.out.println("dwse etos tou " + (i+1) +"ou ");
            etos = UserInput.getShort();
            p[i].setEtos(etos);
            System.out.println("dwse am tou " + (i+1) +"ou");
            p[i].setAM(UserInput.getShort());
        }
        
  //      MyUtils.insertSortAM(p);
  //      for(int i=0; i<p.length; i++)
  //          System.out.println(p[i]);
        
  //      MyUtils.selectSortEponymo(p);
  //      for(int i=0; i<p.length; i++)
   //         System.out.println(p[i]);
        
   //     MyUtils.bubbleSortEE(p);
   //     for(int i=0; i<p.length; i++)
    //        System.out.println(p[i]);

       // MyUtils.quickSortAM(p);
        
       MyUtils.quickSort(p, 0, p.length-1);
       for(int i=0; i<p.length; i++)
       System.out.println(p[i]);
       
       
    }
}


