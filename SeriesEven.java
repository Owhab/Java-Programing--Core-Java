import java.util.Scanner; 
class SeriesEven{
    
    public static void main(String [] args)
    {
        
        Scanner in = new Scanner(System.in);
        
        int F, L, Sum;
        Sum = 0;
        
        System.out.print("Please Enter the first Value: ");
        F = in.nextInt();
        
        System.out.print("Please Enter the Last Value: ");
        L = in.nextInt();
        if(F % 2 == 0)
            
            
        
        for (int i = F; i <= L; i = i+2)
        {
            
            System.out.println(i);
            Sum = Sum + i;
        }
        
        System.out.println("The Result is: "+Sum);
        
        
        
    }
}