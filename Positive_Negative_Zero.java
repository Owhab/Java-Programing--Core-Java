import java.util.Scanner;

class Positive_Negative_Zero{
    public static void main(String [] Args)
    {
        
        Scanner input = new Scanner(System.in);
        
        int a;
        
        System.out.print("Please Enter a number: ");
        a = input.nextInt();
        
        if ( a > 0){
            System.out.println("This is a positive number");
        }
        else if(a < 0){
            System.out.println("This is a Negative Number");
        }
        else{
            System.out.println("This is Zero");
            
        }
        
        
        
        
    }
    
    
    
    
    
    
}