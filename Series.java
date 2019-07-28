import java.util.Scanner;

class Series{
    public static void main(String [] args)
    {
        
        System.out.println("Now we are going to learn about series");
        
        
        Scanner in = new Scanner(System.in);
        
        int n, sum = 0;
        
        
        System.out.print("Please Enter the Last Number: ");
        n = in.nextInt();
        
        for ( int i = 1; i <= n; i++)
        {
            
            
            sum = sum + i;
            
            System.out.println(i);
            
        }
        
        System.out.println("The Summation is: "+sum);
        
        
        
    }
    
    
}