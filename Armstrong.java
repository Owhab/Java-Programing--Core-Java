import java.util.Scanner;

class Armstrong
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("In this programi we are going to check that a number is Armstrong or not armstrong. ")
        
        int num, sum, temp, r;
        
        sum = 0;
        
        System.out.print("Enter a number: ");
        num = in.nextInt();
        
        temp = num;
        
        while(temp != 0)
        {
            r = temp % 10;
            sum = sum + r * r * r;
            temp = temp / 10;
        }
        
        if(sum == num)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not armstrong number");
        }
        
    }
}