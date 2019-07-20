import java.util.Scanner;

class Else_If_Statement{
    public static void main(String []Args)
    {
        System.out.println("We are going to practise about Else If Statement");
        
        Scanner input = new Scanner(System.in);
        
        int a, b;
        
        
        System.out.print("Please Enter the value of a: ");
        a = input.nextInt();
        
        System.out.print("Please Enter the value of b: ");
        b = input.nextInt();
        
        
        
        if (a > b){
            System.out.println("a is greater than b");
        }
        else if (b > a){
            System.out.println("b is greater than a");
        }
        else {
            System.out.println("We don't know");
        }
        
    }
}