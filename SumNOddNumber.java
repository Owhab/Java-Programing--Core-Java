import java.util.Scanner;



class SumNOddNumber{
    public static void main(String [] args)
    {
    Scanner in = new Scanner(System.in);
    
    int Initial, Final, Sum;
    Sum = 0;
    
    System.out.print("Please Enter an Odd Number: ");
    Initial = in.nextInt();
        
    System.out.print("Please Enter the Final Number: ");
    Final = in.nextInt();
        
    for (int i = Initial; i <= Final; i = i + 2)
    {
        if (Initial % 2 == 1)
        {
            Sum = Sum + i;
            System.out.println(i);
        }
        
        
    }
         System.out.println("The Summation is: "+Sum);
 
        
        
    }
}