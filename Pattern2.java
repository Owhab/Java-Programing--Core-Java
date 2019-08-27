import java.util.Scanner;

class Pattern2
{
    public static void main(String [] args)
    {
        
        Scanner in = new Scanner(System.in);
        
        int n;
        
        System.out.print("Please enter the value of n: ");
        n = in.nextInt();
        
        
        for(int row = n; row >= 1; row--)
        {
            for(int col = 1; col <= row; col++)
            {
                System.out.print(" "+col);
            }
            System.out.println();
        }
        
        
    }
}