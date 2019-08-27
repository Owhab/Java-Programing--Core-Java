import java.util.Scanner;
class Prime
{
    public static void main(String []args)
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please Enter Your number: ");
        int n = sc.nextInt();
        
        int count = 0;
        
        for (int i = 2; i < n; i++)
        {
            if(n % i == 0)
            {
                count++;
                break;
            }
            System.out.println("Prime Numbers are: "+i);

        }
        

        
        
        
        
        
    }
}