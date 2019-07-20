import java.util.Scanner;
class VC{
public static void main (String []Args)
{
    System.out.println("We are going to find vowel and consonant");
    
    
    
    Scanner in = new Scanner(System.in);
    
    char ch;
    
    System.out.print("Please Enter a letter: ");
    ch = in.next().charAt(0);
    
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
    {
        System.out.println("This is a vowel");
    }
    else
    {
        System.out.println("This is a consonant");
    }
    
    
}
}