import java.util.Scanner;

class Even_Odd{
    public static void main(String []Args)
    {
        System.out.println("We are going to calculate Even and Odd Numbers");
            
            Scanner input = new Scanner(System.in);
        
        
        int a;
        System.out.print("Please Enter the value of a: ");
        a = input.nextInt();
        
        
        
        
        if (a%2==0){
            System.out.println("This is an Even Number");
        }
        else {
            System.out.println("This is an Odd Number");
            
        }
        
        
        
        
        
        
        
    }
    
    
    
    
    
}