import java.util.Scanner;

class D_U_L
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        int a, b; 
        
        System.out.print("Please Enter the value of a: ");
        a = in.nextInt();
        
        System.out.print("Please Enter the value of b: ");
        b = in.nextInt();
        
        int[][] A = new int[a][b];
        
        
        
        System.out.println("Enter the Elements of A Matrix: ");
        for( int row = 0; row < a; row++)
        {
            for(int col = 0; col < b; col++)
            {
                System.out.printf("A = [%d][%d] : ", row, col);
                A[row][col] = in.nextInt();
                
            }
        }
        
        System.out.println("The Value of A Matrix: ");
        for(int row = 0; row < a; row++)
        {
            for(int col = 0; col < b; col++)
            {
                System.out.print("\t"+A[row][col]);
            }
            System.out.println();
        }
        
        int Diagonal = 0, Upper = 0, Lower = 0;

        
        
        for(int row = 0; row < a; row++)
        {
            for(int col = 0; col < b; col++)
            {
                
                if(row == col)
                
                    Diagonal = Diagonal + A[row][col];
                
                if(row < col)
            
                    Upper = Upper + A[row][col];
                
                if(row > col)
                
                    Lower = Lower + A[row][col];
                
                
                
                
            }
        }
        
        System.out.println("The Value of Diagonal Triangle is: "+Diagonal);
        System.out.println("The value of Upper Triangle is: "+Upper);
        System.out.println("The Value of Lower Triangle is: "+Lower);
        
        
        
    }
}