import java.util.Scanner;


class MathDemo{
    public static void main(String [] Args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Now, we are going to learn about Java Math CLass");
        
        int a, b, absolute, round, Maximum, Minimum; 
        double power;
        
        System.out.print("Please Enter the value of a: ");
        a = in.nextInt();
        
        System.out.print("Please Enter the value of b: ");
        b = in.nextInt();
        
        
        
        
        Maximum = Math.max(a, b);
        Minimum = Math.min(a, b);
        absolute = Math.abs(b);
        power = Math.pow(a, b);
        round = Math.round(8.653f);
        
        
        
        
        
        
        System.out.println("The Maximum Number is : "+Maximum);
        System.out.println("The Minimum Number is : "+Minimum);
        System.out.println("The Absolute value of b is: "+absolute);
        System.out.println("a to the power b: "+power);
        System.out.println("Th Round Value is: "+round);
        System.out.println(Math.PI);
        System.out.println(Math.E);
        
        
        
        
        
    }
    
    
    
    
    
}