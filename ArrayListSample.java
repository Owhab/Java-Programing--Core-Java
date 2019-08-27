import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class ArrayListSample
{
    public static void main(String [] args)
    {
        
        ArrayList <Integer> number = new ArrayList<> ();
        
        System.out.println("Size of the ArrayList: "+number.size());
        System.out.println();
        
        
        number.add(5);
        number.add(545);
        number.add(5454);
        number.add(545545);
        number.add(54466);
        
        System.out.println(number);
        
        System.out.println();
        
        System.out.println("Printing the Output of the Arraylist Using for Each Loop");
        
        for(int x : number)
        {
            System.out.println(x);
            
        }
        System.out.println("Printing the Output of the ArrayList using Iteration: ");
        
        Iterator itr = number.iterator();
        while(itr.hasNext() )
        {
            System.out.println(itr.next());
        }
        boolean contain = number.contains(545);
        
        int pos = number.indexOf(545);
        System.out.println("Index of 545 is: "+pos);
        
        number.set(2, 656);
        
        System.out.println("After Setting : "+number);
        
        int n = number.get(2);
        
        System.out.println("The Element is: "+n);
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        System.out.println("545 is in the ArrayList: "+contain);
        
        System.out.println("Now the size of the ArrayList is: "+number.size());
        
        boolean check = number.isEmpty();
        System.out.println("ArrayList Empty ? :"+check);
        
        number.clear();
        
        System.out.println("After Clearing : "+number);
        
        System.out.println("Size of the ArrayList : "+number.size());
        
        check = number.isEmpty();
        
        System.out.println("ArrayList Empty ? : "+check);
        
        contain = number.contains(545);
        
        System.out.println("545 is in the ArrayList: "+contain);
        
        
        
        
        
        
    }
}

