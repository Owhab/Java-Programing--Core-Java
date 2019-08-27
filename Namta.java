import java.util.Scanner;

class Namta
{
    public static void main(String [] args)
    {
        
        Scanner sc = new Scanner(System.in);
        
        int m, n;
        
        
        System.out.print("Please Enter the initial number: ");
        m = sc.nextInt();
        
        System.out.print("Please Enter the Last Number: ");
        n = sc.nextInt();
        
        for(int i = m; i <= n; i++)
            {
            for (int j = 1; j <= 10; j++)
            {
                System.out.println(i+"x"+j+"="+i*j);
                
                
            }
            System.out.println();
            System.out.println();
        
        }
    }
}