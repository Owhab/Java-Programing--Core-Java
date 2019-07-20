import java.util.Scanner;

class Vowel_Consonant{
    public static void main(String []Args)
    {
        
        Scanner input = new Scanner(System.in);
        
        char ch; 
        
        System.out.print("Please Enter a char value: ");
        ch = input.next().charAt(0);
        
        if(ch == 'a')
        {
            System.out.println("This is  a vowel");
        }
        else if(ch == 'e')
        {
            System.out.println("This is  a Vowel");
        }
        else if(ch == 'i')
        {
            System.out.println("This is a Vowel");
        }
        else if(ch == 'o')
        {
            System.out.println("This is a Vowel");
        }
        else if(ch == 'u')
        {
            System.out.println("This is a Vowel");
        }
        else
        {
            System.out.println("This is a Consonant");
        }
        
        
        
        
    }
    
    
    
    
}