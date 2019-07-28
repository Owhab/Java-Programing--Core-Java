import java.util.Scanner;

class Series4
{
    public static void main(String [] args)
    {
        
        Scanner in = new Scanner(System.in);
        
        
        double l, sum = 1.5;
        
        System.out.print("Please Enter the last value: ");
        l = in.nextDouble();
        
        for ( double i = 1.5; i <= l; i++)
        {
            sum = sum + i;
            
            System.out.println(i);
            
        }
        
        System.out.println("The Result is: "+sum);
        
        
        
        
        
    }
    
}