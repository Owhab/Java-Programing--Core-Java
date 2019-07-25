import java.util.Scanner;

class SeriesSum.java{
    public static void main (String[] args)
    {
        System.out.println("In this session we are going to learn about Series in Java");
        
        Scanner in = new Scanner(System.in);
        
        
        int n, sum = 0;
        System.out.print("Please Enter the last Number of the Series: ");
        n = in.nextInt();
        
        for (int i = 1; i <= n; i++)
        {
        sum = sum + i;

        System.out.println(i);
        }
        System.out.println("The Summation of the Series is: "+sum);

    }
    
    
}