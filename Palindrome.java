import java.util.Scanner;

class Palindrome
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int rev, num, temp, r;
        
        rev = 0;
        
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        
        
        temp = num;
        
        while(temp != 0)
        {
            r = temp % 10;
            rev = rev * 10 + r;
            temp = temp / 10;
            
            
        }
        if(rev==num)
        {
            System.out.println("Plaindrome");
        }
        else
        {
            System.out.println("Not Palinfrome");
        }
        
        
        
    }
        
        
}