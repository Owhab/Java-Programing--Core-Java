import java.util.Scanner;
class Series7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int l, sum = 0;
        
        System.out.print("Please ENter the last Value: ");
        l = in.nextInt();
        
        
        for(int i=1; i <= l; i++)
        {
            System.out.println(i+"x"+i);
            sum = sum + i * i;
            
            
        }
        
        System.out.println("The Summation is: "+sum);
        
        
    }
}