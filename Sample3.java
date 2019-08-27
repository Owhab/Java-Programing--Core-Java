import java.util.Scanner;

class Sample3
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        int a, b, c, d, e, f, g, h;
        
        System.out.print("Please Enter the value of a: ");
        a = in.nextInt();
        
        System.out.print("Please Enter the value of b: ");
        b = in.nextInt();
        
        System.out.print("Please Enter the value of c: ");
        c = in.nextInt();
        
        System.out.print("Please Enter the value of d: ");
        d = in.nextInt();
        
        /* System.out.print("Please Enter the value of e: ");
        e = in.nextInt();
        
        System.out.print("Please Enter the value of f: ");
        f = in.nextInt();
        
        System.out.print("Please ENter the value of g: ");
        g = in.nextInt();
        
        System.out.print("Please enter the value of h: ");
        h = in.nextInt(); */ 
        
        
        int[][] A = new int[a][b];
        int[][] B = new int[c][d];
        int[][] C = new int[a][b];
        int[][] D = new int[c][d];
        int[][] E = new int[a][b];
        
        
        
        
        System.out.println("Please Enter the elements of A Matrix: ");
        
        for( int row = 0; row < a; row++)
        {
            for( int col = 0; col < b; col++)
            {
                System.out.printf("A = [%d][%d] : ", row, col);
                A[row][col] = in.nextInt();
                
                
            }
        }
        
        System.out.println("Please enter the value of B Matrix: ");
        for( int row = 0; row < c; row++)
        {
            for( int col = 0; col < d; col++)
            {
                System.out.printf("B = [%d][%d] : ", row, col);
                B[row][col] = in.nextInt();
                
            }
        }
        
        System.out.println("Value of A Matrix: ");
        for(int row = 0; row < a; row++)
        {
            for(int col = 0; col < b; col++)
            {
                System.out.print("\t"+A[row][col]);
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();

        
        System.out.println("value of B Matrix: ");
        for(int row = 0; row < c; row++)
        {
            for(int col = 0; col < d; col++)
            {
                System.out.print("\t"+A[row][col]);
            }
            System.out.println();
        }
        
        
        System.out.println();
        System.out.println();
        
        System.out.println("The Summation of A and B matrix: ");
        for(int row = 0; row < a; row++)
        {
            for(int col = 0; col < b; col++)
            {
                C[row][col] = A[row][col] + B[row][col];
                System.out.print("\t"+C[row][col]);
                
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        
        
        System.out.println("The Multiplication of A and B matrix: ");
        
        for(int row = 0; row < a; row++)
        {
            for(int col = 0; col < b; col++)
            {
                D[row][col] = A[row][col] * B[row][col];
                System.out.print("\t"+D[row][col]);
                
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        
        
        System.out.println("The Subtraction of A and B matrix: ");
        for(int row = 0; row < a; row++)
        {
            for(int col = 0; col < b; col++)
            {
                E[row][col] = A[row][col] - B[row][col];
                
                System.out.print("\t"+E[row][col]);
            }
            System.out.println();
        }
       
    }
}