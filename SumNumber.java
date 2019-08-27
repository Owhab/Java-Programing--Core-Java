import java.util.Scanner;

class SumNumber
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        int sum = 0;
        
        int r, num, temp;
        
        System.out.print("Please Enter a number: ");
        num = in.nextInt();
        
        temp = num;
        
        while(temp != 0)
        {
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
            
            
            
        }
        
        System.out.println("The Summation is: "+sum);
        
        
    }
}