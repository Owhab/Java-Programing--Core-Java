import java.util.Scanner;

class Series2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        
        System.out.println("We are going to find the value of a Series");
        
        int f, l, sum;
        
        
        
        
        System.out.print("Please Enter the Last Number: ");
        l = in.nextInt();
        
        sum = 0;
        
        for (int i = 0; i <= l; i = i + 2)
        
        {
        sum = sum + i;
        System.out.println(i);

        }
        System.out.println("The Result is: "+sum);

        
    }
}