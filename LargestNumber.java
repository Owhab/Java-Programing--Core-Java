import java.util.Scanner;

class LargestNumber{
    public static void main(String []Args)
    {
        System.out.println("We are going to find the largest number from three numbers");
        
        
        int a, b, c;

        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please Enter the value of a: ");
        a = in.nextInt();
        
        System.out.print("Please Enter the value of b: ");
        b = in.nextInt();
        
        System.out.print("Please Enter the value of c: ");
        c = in.nextInt();
        
        if (a > b && a > c)
        {
            System.out.println("a is largest");
        }
        else if(b > a && b > c)
        {
            System.out.println("b is largest");
        }
        else
        {
            System.out.println("c is largest");
        }
        
        
        
        
        
    }
    }