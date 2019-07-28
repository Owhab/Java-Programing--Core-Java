import java.util.Scanner;

class Factorial
{
    public static void main(String [] args)
    {
        
        Scanner in = new Scanner(System.in);
        
        int n, result = 1;
        
        System.out.print("Please Enter the value of n: ");
        n = in.nextInt();
        
        for (int i = 1; i <= n; i++)
        {
            System.out.println(i);
            result = result * i;
        }
        
        System.out.println("The Factorial is: "+result);
        
        
        
    }
}