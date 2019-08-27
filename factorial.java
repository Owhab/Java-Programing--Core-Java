import java.util.Scanner;

class factorial
{
    public static void main(String [] args)
    {
        
        Scanner in = new Scanner(System.in);
        
        int n, fact = 1;
        
        
        System.out.print("Please ENter a Positive Number: ");
        n = in.nextInt();
        
        for(int i = n; i >= 1; i--)
        {
            fact = fact * i;
            System.out.println(i);
            
        }
        System.out.println("The factorial is: "+fact);
        
        
        
    }
}