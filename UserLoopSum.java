import java.util.Scanner;
class UserLoopSum{
    public static void main (String [] args)
    {
       
        Scanner in = new Scanner(System.in);
        
        int sum, a, b;
        sum = 0;
        
        System.out.print("Please Enter the Initaial Number: ");
        a = in.nextInt();
        
        System.out.print("Please Enter the Limit: ");
        b = in.nextInt();
        
        for (int i = a; i <= b; i++)
        {
            
            sum = sum + i;

        }
        System.out.println("The Result is: "+sum);

        
        
        
        
    }
    
    
}