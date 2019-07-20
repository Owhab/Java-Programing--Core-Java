import java.util.Scanner;

class Conditional_Operator{
    public static void main(String []Args)
    {
        System.out.println("Now, We are going to learn about Conditional_Operator");
        
        Scanner in = new Scanner(System.in);
        
        int a, b, large;
        
        System.out.print("Please Enter the value of a: ");
        a = in.nextInt();
        
        System.out.print("Please Enter the value of b: ");
        b = in.nextInt();
        
        large = a > b ? a : b;
        
        System.out.println("The Largest Numbe is: "+ large);
        
        
        
        
        
        
        
    }
}