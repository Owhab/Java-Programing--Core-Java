import java.util.Scanner;


class SumNNumber{
    public static void main(String[] args)
    {
        System.out.println("This Java Program is for Practising");
        
        int Initial, Final, sum;

        Scanner in = new Scanner(System.in);
        
        
        
        System.out.print("Please Enter the Initial Number: ");
        Initial = in.nextInt();
        
        System.out.print("Please Enter te Final Number: ");
        Final = in.nextInt();
        
        
        sum = 0;
        
        for (int i = Initial; i <= Final; i++ )
        {
            System.out.println(i);
            
            sum = sum + i;
        }
        
        System.out.println("The Summation of two Numbers is: "+sum);
        
    }
}