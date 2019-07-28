import java.util.Scanner;

public class Series5
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        
        int l, result = 0, sum = 0;
        
        
        System.out.print("Please ENter the Last Number : ");
        l = in.nextInt();
        
        for (int i = 1; i <= l; i++)
        {
            result = i * i;
            sum = sum + i * i;
            System.out.println(i+"x"+i+"="+result);

        
            
        }
        System.out.println("The result is: "+sum);
        
    }
}