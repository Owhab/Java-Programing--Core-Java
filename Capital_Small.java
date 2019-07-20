import java.util.Scanner;


class Capital_Small{
    public static void main(String []Args)
    {
        System.out.println("We are going to check Capital and Small Letters");
        
        Scanner in = new Scanner(System.in);
        char ch;
        
        System.out.print("Please Enter a Character: ");
        ch = in.next().charAt(0);
        
        if (ch >= 'a' && ch <= 'z')
        {
            System.out.println("This lette is a small letter");
        }
        else if(ch >='A' && ch <= 'Z')
        {
            System.out.println("This letter is a Capital Letter");
        }
        else
        {
            System.out.println("This is a Special Character");
            
        }
        
        
        
        
    }
}