import java.util.Scanner;

class If_Else_Statement{
    public static void main(String []args)
    {
        System.out.print("We are going to practise about If and Else Statement of Control Statement");
        
        
        
        Scanner input = new Scanner(System.in);
        
        
        int a, b;
        
        System.out.print("Please Enter the value of a: ");
        a = input.nextInt();
        
        System.out.print("Please Enter the value of b: ");
        b = input.nextInt();
        
        if (a > b){
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("b is greater than or equal to a");
        }
        
    }
    
    
    
    
}