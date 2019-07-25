import java.util.Scanner;
class Practise{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        int First, Last, Sum = 0;
        
        System.out.print("Please Enter the first Number: ");
        First = in.nextInt();
        
        System.out.print("Please Enter the Last Number: ");
        Last = in.nextInt();
        
        
        for (int i = First; i <= Last; i = i + 1)
        {
            Sum = Sum + i;
            System.out.println(i);
            
            
            
        }
        System.out.println("The Summation is: "+Sum);
    }
    
    
}