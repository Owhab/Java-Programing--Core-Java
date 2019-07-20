import java.util.Scanner;


class result{
    public static void main (String []Args)
    {
        System.out.println("We are going to calculate result of a student");
        
        Scanner in = new Scanner(System.in);
        
        
        
        int number;
        
        System.out.print("Please Enter Your Number : ");
        number = in.nextInt();
        
        
        
        if (number >= 80)
        {
            System.out.println("Congratulations, You have got A+");
        }
        else if (number >= 70)
        {
            System.out.println("Good, You have got A Grade");
        }
        else if (number >= 60)
        {
            System.out.println("Hey, You have got A- ");
        }
        else if (number >= 50)
        {
            System.out.println("You have got B Grade");
        }
        
        else if(number >= 40)
        {
            System.out.println("You have got C");
        }
        else if (number >= 33)
        {
            System.out.println("You have got D Grade");
        }
        else
        {
            System.out.println("Oops, You have failed is this exam. Please Try again.");
            
        }
        
        
        
        
    }
    
    
    
    
}