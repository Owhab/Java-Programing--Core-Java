import java.util.Scanner;

class PrimeN
{
    public static void main(String [] args)
    {
        
        Scanner sc = new Scanner(System.in);
        
        int num;
        System.out.print("Please Enter a positive number: ");
        num = sc.nextInt();
        
        int count = 0;
        
        for(int i = 2; i < num; i++ )
        {
            if(num%i==0)
            {
            count++;
            break;
            }
        }
        if(count==0)
        {
            System.out.println("This is a Prime Number");
        }
        else
        {
            System.out.println("This is not a Prime Number");
        }
        
        
    }
}