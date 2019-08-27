import java.util.Scanner;

class RevNum
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        int sum, num, temp, r;
        
        System.out.print("Enter a number: ");
        num = in.nextInt();
        
        sum = 0;
        
        temp = num;
        
        while(temp != 0)
        {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
            
            
            
            
        }
        System.out.println("The Number after reverse is: "+sum);
        
    }
}