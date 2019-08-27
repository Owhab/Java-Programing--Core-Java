import java.util.Scanner;

class DiagonalUpperLower
{
    public static void main(String [] args)
    {
        
        Scanner in = new Scanner(System.in);
        
        int[][] A = new int[3][3];
        
        System.out.println("Please enter the value of A matrix: ");
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                System.out.printf("A[%d][%d] : ", row, col);
                A[row][col] = in.nextInt();
            }
        }
        
        System.out.println("The  value of A Matrix is: ");
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                System.out.print("\t"+A[row][col]);
            }
            System.out.println();
        }
        
        int Diagonal = 0;
        int Upper = 0;
        int Lower = 0;
        
        for(int row = 0; row < 3; row++)
        {
            for(int col = 0; col < 3; col++)
            {
                
                if(row == col)
                    Diagonal = Diagonal + A[row][col];
                if(row < col)
                    Upper = Upper + A[row][col];
                if(row > col)
                    Lower = Lower + A[row][col];
              
            }
        }
        
        System.out.println("The value of Diagonal Triangle is: "+Diagonal);
        
        System.out.println("The value of Upper Triangle is; "+Upper);
        
        System.out.println("The Value of Lower Triangle is: "+Lower);
        
    }
}