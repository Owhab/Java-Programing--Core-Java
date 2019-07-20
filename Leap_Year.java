import java.util.Scanner;

class Leap_Year{
    public static void main(String []Args)
    {
        System.out.println("We are going to find the Lear");
        
        
        
        int year; 
        
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please Enter a valid year: ");
        year = in.nextInt();
        
        
        if (year % 4 == 0)
        {
            System.out.println("This year is a leap year");
        }
        else
        {
            System.out.println("This is not a leap year");
        }
        
        
        
        
    }
    
    
    
    
}