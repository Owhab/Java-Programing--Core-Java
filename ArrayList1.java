import java.util.Scanner;

import java.util.ArrayList;

import java.util.Iterator;



class ArrayList1
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        
        ArrayList<Integer> number = new ArrayList<> ();
        
        
        System.out.println("Size of the ArrayList : "+number.size());
        
        /* System.out.print("Please enter the value of the Arraylist: ");
        for(int x : number)
        {
            number = in.nextInt();
            number.add();
        }
        */ 
        
        //Adding Elements into the ArrayList
        
        number.add(10);
        number.add(343);
        number.add(5454);
        number.add(4154);
        number.add(4, 545);
        
        
        
        //System.out.println(number);
        // Printing the output of ArrayList by Using for each loop;
        
        /* for(int x : number)
        {
            System.out.println(x);
        }
        */
        
        
        Iterator itr = number.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        System.out.println("Size of the Array After entering Elements: "+number.size());
        
        
    }
}