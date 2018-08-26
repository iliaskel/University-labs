package pkg04.ta3inomisi;


public class MyUtils {
     public static int anazitisiMeEpwnymo(String lname,Foititis[] pin){
        for(int i=0; i<pin.length; i++)
            if(pin[i].getEpwnymo().equals(lname))
                    return (i+1);
            return -1;
        }
     
     public static int anazitisiMeArMitrwou(Foititis[] pin, short ar, int left, int right){
         int mid;
         int pos = -1;
         while (pos==-1 && left<right){
             mid = (left+right)/2;
             if (ar > pin[mid].getAM())
                 left = mid+1;
             else
                 if (ar<pin[mid].getAM())
                     right = mid-1;
                 else
                     pos = mid;
         }
         return pos;
     }
     
     public static void insertSortAM(Foititis[] p){
         Foititis key;
         int pos;
         for (int i=1; i<p.length; i++){
             key = p[i];
             pos=i;
             
             while(pos>0 && p[pos-1].getAM()>key.getAM()){
                 p[pos] = p[pos-1];
                 pos--;
             }
             p[pos] = key;
         }
     }
     
 //    public static void selectSortEponymo(Foititis[] p){
 //        int min;
 //        String temp;
 //        for(int i=0; i<p.length; i++){
 //            min=i;
 //            for(int scan=i+1; scan<p.length; scan++)
 //                if(p[scan].getEpwnymo() < p[min].getEpwnymo())
 //                    min = scan;
 //            temp = p[min].getEpwnymo();
  //           p[min] = p[i];
 //            p[i].epwnymo = temp;
 //        }
  //   }
     
     public static void bubbleSortEE(Foititis[] p){
         int i, j;
         short temp;
         boolean flag;
         for(i=1; i<p.length; i++){
             flag=true;
             for(j=0; j<p.length-i; j++)
                 if(p[j].getEtos() > p[j+1].getEtos()){
                     temp=p[j].getEtos();
                     p[j]=p[j+1];
                     p[j+1].etos=temp;
                     flag=false;
                 }
             if(flag) return;   
         }
     }
     
  //   public static void swap(Foititis[] p, int x, int y){
  //       short temp=p[x];
  //       p[x]=p[y];
  //       p[y]=temp;
 //    }
     
//     public static int partition(Foititis p[], int f, int l){
  //       int ret_value;
    //     int lowerLimit = f;
      //   int mid=(f+l)/2;
     //    swap(p, f, mid);
         
    //     int pivot = p[f].getAM();
    //     f++;
     //    while(f<l){
      //       while (p[f].getAM() <= pivot && f<l) f++;
        //     while (p[l].getAM() >= pivot && f<=l) l--;
       //      if (f<l) swap(p, f, l);
      //   }
    //     if(pivot > p[f].getAM()){
    //         swap (p, f, lowerLimit);
     //        ret_value=f;
      //   }
      //   else{
      //       if(pivot >= p[l].getAM()){
      //           swap(p, l, lowerLimit);
      //           ret_value=l;
      //       }
      //       return ret_value;
      //   }
     //   }
     
     public static int partition(Foititis[] p, int left, int right){
         int i=left, j=right;
         short tmp;
         
         short pivot = p[(left+right)/2].getAM();
         while(i<=j){
             while(p[i].getAM()<pivot)
                 i++;
             while(p[j].getAM()>pivot)
                 j--;
             if(i<=j){
                 tmp=p[i].getAM();
                 p[i]=p[j];
                 p[j].am=tmp;
                 i++;
                 j--;
             }
         }
         return i;
     }
     
     public static void quickSort(Foititis[] p, int left, int right){
         int index=partition(p, left, right);
         if(left<index-1)
             quickSort(p, left, index-1);
         if(index<right)
             quickSort(p, index, right);
     }
     
     public static void mergeSortEponymo(Foititis[] p){
         Msort(p, 0, p.length-1);
     }
     
     public static void Msort(Foititis[] p, int f, int l){
         if(f==l) return;
         int mid=(f+l)/2;
         Msort(p, f, mid);
         Msort(p, mid+1, l);
         merge(p, f, l, mid);
     }
     
     
     public static void merge(Foititis A[],int f,int l,int mid)
    {
        int length = l-f+1;
        Foititis b[] = new Foititis[length];
        int i1=f;
        int i2=mid+1;
        int j=0;
        while(i1<=mid && i2<=l)
        {
            if((A[i1].getEpwnymo().compareTo(A[i2].getEpwnymo())) < 0)
            {
                b[j] = A[i1];
                i1++;
            }
            else
            {
                b[j] = A[i2];
                i2++;
            }        
            j++;
        }
        while(i1<=mid)
        {
            b[j] = A[i1];
            i1++;
            j++;
        }
        while(i2<=l)
        {
            b[j]=A[i2];
            i2++;
            j++;
        }
        for(j=0;j<length;j++)
            A[f+j] = b[j];       
    }
}
