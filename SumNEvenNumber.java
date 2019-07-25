import java.util.Scanner;



class SumNEvenNumber{
    public static void main(String [] args)
    {
    Scanner in = new Scanner(System.in);
    
    int Initial, Final, Sum;
    Sum = 0;
    
    System.out.print("Please Enter the Initial Number: ");
    Initial = in.nextInt();
        
    System.out.print("Please Enter the Final Number: ");
    Final = in.nextInt();
        
    for (int i = Initial; i <= Final; i = i + 2)
    {
        if (Initial % 2 == 0)
        {
            Sum = Sum + i;
        }
        else
        {
            System.out.println("The Initial Number is not an Even Number");
        }
        
    }
         System.out.println("The Summation is: "+Sum);
 
        
        
    }
}