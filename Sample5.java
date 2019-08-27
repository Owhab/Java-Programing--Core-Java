import java.util.Scanner;

class Sample5
{
    public static void main(String [] args)
    {
        int[][] number = new int[16][];
        
        int n = 0;
        
        number[0] = new int[1];
        number[1] = new int[2];
        number[2] = new int[3];
        number[3] = new int[4];
        number[4] = new int[5];
        number[5] = new int[6];
        number[6] = new int[7];
        number[7] = new int[8];
        number[8] = new int[9];
        number[9] = new int[10];
        number[10] = new int[11];
        number[11] = new int[12];
        number[12] = new int[13];
        number[13] = new int[14];
        number[14] = new int[15];
        number[15] = new int[16];
        
        
        
        for(int row = 0; row < 16; row++)
        {
            for(int col = 0; col < row + 1; col++)
            {
                number[row][col] = n;
            n++;
                
                
            }
        }
        
        for(int row = 0; row < 16; row++)
        {
            for(int col = 0; col < row + 1; col++)
            {
                System.out.print("\t"+number[row][col]);
            }
            System.out.println();
        }
    
        
        
        
        
    }
}