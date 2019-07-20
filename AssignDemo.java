import java.util.Scanner;

class AssignJava{
    public static void main (String [] Args)
    {
        Scanner input = new Scanner(System.in);
        
        
        int a, b, c, d;
        
        System.out.print("Please Enter the value of a: ");
        a = input.nextInt();
        
        System.out.print("Please Enter the value of b: ");
        b = input.nextInt();
        
        System.out.print("Please Enter the value of c: ");
        c = input.nextInt();
        
        System.out.print("Please Enter the value of d: ");
        d = input.nextInt();
        
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        
        
        a += 5;
        b -= 10;
        c *= 15;
        d /= 20;
        
        System.out.println("After Assigning The Value of a, b, c and d is: ");
        
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        
        
        
        
    }
}