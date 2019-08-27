import java.util.Scanner;

class TwoDArray
{
    public static void main(String [] args)
    {
        
        System.out.println("Now We are going to learn about 2D Array in Java");
        
        int[][] number = new int[5][5];
        
        number[0][0] = 1;
        number[0][1] = 2;
        number[0][2] = 3;
        number[0][3] = 4;        
        number[0][4] = 5;
        
        number[1][0] = 6;
        number[1][1] = 7;
        number[1][2] = 8;
        number[1][3] = 9;
        number[1][4] = 10;
        
        number[2][0] = 11;
        number[2][1] = 12;
        number[2][2] = 13;
        number[2][3] = 14;
        number[2][4] = 15;
        
        number[3][0] = 16;
        number[3][1] = 17;
        number[3][2] = 18;
        number[3][3] = 19;
        number[3][4] = 20;
        
        number[4][0] = 21;
        number[4][1] = 22;
        number[4][2] = 23;
        number[4][3] = 24;
        number[4][4] = 25;
        
        
        
        for(int row = 0; row < 5; row++)
        {
            for(int col = 0; col < 5; col++)
            {
                System.out.print("  "+number[row][col]);
            }
            System.out.println();
        }
                           
        
    }
}