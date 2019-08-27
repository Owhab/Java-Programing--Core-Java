import java.util.Scanner;

class Timetable
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        int n;
        
        
        System.out.print("Please Enter the value of n: ");
        n = in.nextInt();
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(n+"x"+i+"="+n * i);
        }
        
        
    }
}