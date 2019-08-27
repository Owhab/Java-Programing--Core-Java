import java.util.Scanner;
class ArrayNMatrix
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please Enter the value of m: ");
        int m = in.nextInt();
        
        System.out.print("Please Enter the value of n: ");
        int n = in.nextInt();
        
        System.out.print("Please Enter the value of x: ");
        int x = in.nextInt();
        
        System.out.print("Please Enter the value of y: ");
        int y = in.nextInt();
        
        System.out.print("Please Enter the valeu of p: ");
        int p = in.nextInt();
        
        System.out.print("Please Enter the value of q: ");
        int q = in.nextInt();
        
        System.out.print("Please Enter the value of a: ");
        int a = in.nextInt();
        
        System.out.print("Please Enter the value of b: ");
        int b = in.nextInt();
        
        System.out.print("Please Enter the value of c: ");
        int c = in.nextInt();
        
        System.out.print("Please Enter the value of d: ");
        int d = in.nextInt();        
        
        
        
        int[][] A = new int[m][n];
        
        int[][] B = new int[x][y];
        
        int[][] C = new int[p][q];
        
        int[][] D = new int[a][b];
        
        int[][] E = new int[c][d];
        
        
        
        System.out.println("Please Enter the value of a Matrix: ");
        for(int row = 0; row < m; row++)
        {
            for(int col = 0; col < n; col++)
            {
                System.out.printf("A[%d][%d] : ", row, col);
                A[row][col] = in.nextInt();
                
                
            }
        }
        
        
        System.out.println("Please Enter the value of B Matrix: ");
        for(int row = 0; row < x; row++)
        {
            for(int col = 0; col < y; col++)
            {
                System.out.printf("B[%d][%d] : ", row, col);
                B[row][col] = in.nextInt();
                
            }
        }
        
        System.out.println("The Elements of A are: ");
        for(int row = 0; row < m; row++)
        {
            for(int col = 0; col < n; col++)
            {
                System.out.print("\t"+A[row][col]);
            }
            System.out.println();
            
        }
        
        System.out.println();
        System.out.println();
        
        
        System.out.println("The Elements of B are: ");
        for(int row = 0; row < x; row++)
        {
            for(int col = 0; col < y; col++)
            {
                System.out.print("\t"+B[row][col]);
            }
            System.out.println();
            
        }
        
        System.out.println();
        System.out.println();
        
        
        
        System.out.println("The Summation of A and B Matrix are : ");
        for(int row = 0; row < p; row++)
        {
            for(int col = 0; col < q; col++)
            {
                C[row][col] = (A[row][col] + B[row][col]);
                System.out.print("\t"+C[row][col]);
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        
        System.out.println("The Multiplication of A and B Matrix: ");
        for(int row = 0; row < a; row++)
        {
            for(int col = 0; col < b; col++)
            {
                D[row][col] = (A[row][col] * B[row][col]);
                System.out.print("\t"+D[row][col]);
            }
            System.out.println();
            
        }
        
        System.out.println();
        System.out.println();
        
        System.out.println("The Subtraction of A and B: ");
        for(int row = 0; row < c; row++)
        {
            for(int col = 0; col < d; col++)
            {
                E[row][col] = A[row][col] - B[row][col];
                System.out.print("\t"+E[row][col]);
                
            }
            System.out.println();
        }
        
        
        
    }
}