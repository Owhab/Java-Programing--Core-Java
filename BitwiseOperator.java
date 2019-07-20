import java.util.Scanner;

class BitwiseOperator{
    public static void main(String []Args)
    {
        System.out.println("Now, We are going to learn abour Bitwise Operator");
        
        Scanner in = new Scanner(System.in);
        
        
        int a, b, c;
        
        System.out.print("Enter the value of a: ");
        a = in.nextInt();
        
        System.out.print("Enter the value of b: ");
        b = in.nextInt();
        
        
        
        c = a>>2;
        System.out.println(c);
        c = a<<2;
        System.out.println(c);
        
        
        
        
        
        
        
        
    }
}