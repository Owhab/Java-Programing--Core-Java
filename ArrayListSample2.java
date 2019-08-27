import java.util.ArrayList;
import java.util.Collections;



class ArrayListSample2
{
    public static void main(String [] args)
    {
        ArrayList <Integer> number = new ArrayList <> ();
        
        number.add(5);
        number.add(525);
        number.add(-55);
        number.add(54);
        number.add(-545);
        number.add(0);
        
        System.out.println("Before Sorting: "+number);
        
        Collections.sort(number);
        
        System.out.println("After soring in Ascending Order: "+number);
        
        Collections.sort(number, Collections.reverseOrder());
        System.out.println("After Sortig in Descending Order: "+number);

        
    }
    
}