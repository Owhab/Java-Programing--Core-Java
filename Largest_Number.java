import java.util.Scanner;

class Largest_Number{
    public static void main(String []Args)
    {
        
        System.out.println("We are going to find the largest number from two numbers");
        
        
        
        Scanner in = new Scanner(System.in);
        
        int a, b, c;
        
        System.out.print("Please Enter the value of a: ");
        a = in.nextInt();
        
        System.out.print("Please Enter the value of b: ");
        b = in.nextInt();
        
        
        
        if (a > b)
        {
            System.out.println("a is largest");
        }
        else
        {
            System.out.println("b is Largest");
        }
        
        
        
        
    }
    
    
    
    
}