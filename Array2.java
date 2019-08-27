import java.util.Scanner;

class Array2
{
    public static void main(String [] args)
    {
        
        Scanner in = new Scanner(System.in);
        
        
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        
        System.out.println("Please Enter the value of A Matrix: ");
        for(int row = 0; row < 2; row++)
        {
            for(int col = 0; col < 3; col++)
            {    
                System.out.printf("A = [%d][%d] : ",row, col);
                A[row][col] = in.nextInt();
            }
        }
        
        
        
        System.out.println("Please Enter the value of B Matrix: ");
        for(int row = 0; row < 2; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                System.out.printf("B = [%d][%d] : ",row, col);
                B[row][col] = in.nextInt();
            }
        }
        
        System.out.println("The A Matrix is : ");
        for(int row = 0; row < 2; row++)
        {
            for(int col = 0; col < 3; col++)
            {    
                System.out.print(" "+A[row][col]);
            }
            System.out.println();
        }
        
        
        
        
        System.out.println("The B Matrix is : ");
        for(int row = 0; row < 2; row++)
        {
            for(int col = 0; col < 3; col++)
            {    
                System.out.print(" "+B[row][col]);
            }
            System.out.println();
        }
        
    }
}