import java.util.Scanner;

class Nprime
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, count = 0;
        
        System.out.print("Enter the initial number: ");
        a = sc.nextInt();
        
        System.out.print("Enter the last number: ");
        b = sc.nextInt();
        
        for(int i = a; i <= b; i++)
        {
            for(int j = 2; j <= i - 1; j++)
            {
                if(i%j==0)
                {
                    count++;
                    break;
                    
                }
            }
            if(count==0)
            
                System.out.println(i);
            count = 0;
            
        }
        
        
        
    }
}