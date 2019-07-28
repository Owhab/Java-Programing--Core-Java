import java.util.Scanner;

class SeriesFact
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        
        int n, result = 1;
        
        System.out.print("Please Enter the value of n: ");
        n = sc.nextInt();
        
        for(int i = 1; i <= n; i = i + 2)
        {
            
            result = result * i;
            
            System.out.println(i);
            
        }
        
        System.out.println("The Multiplication is: "+result);
        
        
    }
}