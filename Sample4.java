import java.util.Scanner;

class Sample4
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please Enter the value of a: ");
        int a = in.nextInt();
        
        System.out.print("Please Enter the value of b: ");
        int b = in.nextInt();
        
        System.out.print("Please Enter the value of n: ");
        int n = in.nextInt();
        
        int[][] N = new int[a][b];
        
        for(int row = 0; row < a; row++)
        {
            for(int col = 0; col < b; col++)
            {
                N[row][col] = n; 
                n++;
                
            }
        }
        
        System.out.println();
        System.out.println();
        
        System.out.println("The value of N Matrix: ");
        
        for(int row = 0; row < a; row++)
        {
            for(int col = 0; col < b; col++)
            {
                System.out.print("\t"+N[row][col]);
            }
            System.out.println();
        }
        
        
        
    }
}