import java.util.Scanner;


class Series1{
    public static void main(String [] args)
    {
        
        Scanner in = new Scanner(System.in);
        
        int F, L, Sum;
        Sum = 0;
        
        System.out.print("Please Enter the First Value: ");
        F = in.nextInt();
        
        System.out.print("Please Enter the Last Value: ");
        L = in.nextInt();
        
        for (int i = F; i <= L; i++)
        {
            System.out.println(i);
            
            Sum = Sum + i;
            
        }
        
        System.out.println("The Result is: "+Sum);
        
        
        
        
    }
    
    
}