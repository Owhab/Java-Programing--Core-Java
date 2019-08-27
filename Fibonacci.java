import java.util.Scanner;

class Fibonacci
{
    public static void main(String [] args)
    {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many number you want: ");
        int n = in.nextInt();
        
        
        int first = 0;
        int second = 1;
        int fibo;
        
        System.out.println(first);
        System.out.println(second);
        
        
        
        for(int i = 3; i <= n; i++)
        {
            fibo = first + second;
            System.out.println(fibo);
            
            first = second;
            second = fibo;
            
            
        }
        
    }
}