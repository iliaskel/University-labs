package pkg02.anazitisi;


public class MyUtils 
{
     public static int SearchSurname(String lname,Student[] array)
	{
        for(int i=0; i<array.length; i++)
            if(array[i].getSurname().equals(lname))
                    return (i+1);
            return -1;
        }
     
     public static int SearchAM(Student[] array, short ar, int left, int right)
	{
         int mid;
         int pos = -1;
         while (pos==-1 && left<right)
	    {
             mid = (left+right)/2;
             if (ar > array[mid].getAM())
                 left = mid+1;
             else
                 if (ar<array[mid].getAM())
                     right = mid-1;
                 else
                     pos = mid;
         }
         return pos;
     }
}
