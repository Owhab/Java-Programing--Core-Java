import java.util.Scanner;


class SumEven{
    public static void main(String [] args)
    {
        
        Scanner in = new Scanner(System.in);
        
        int sum, a, b;
        
        sum = 0;
        
        System.out.print("Please Enter the Value of Initial a: ");
        a = in.nextInt();
        
        System.out.print("Please Enter the Final Number: ");
        b = in.nextInt();
        
        for(int i = a; i <= b; i = i + 2)
        {
            
            sum = sum + i;
            
        }
        
        System.out.println("The Value of Even Number is: "+sum);

    }
}