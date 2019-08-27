import java.util.Scanner;

class Sample
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        int n, max, min, sum;
        double avg;
        
        System.out.print("How many number do you eant: ");
        n = in.nextInt();
        
        int[] number = new int[n];
        System.out.println("Please Enter your numbers: ");
        for (int i = 0; i < n; i++)
        {    
            number[i] = in.nextInt();
        }
        sum = 0;
        
        for(int i = 0; i < n; i++)
            sum = sum + number[i];
        
        System.out.println("The Summation is: "+sum);
        
        avg = sum / n;
        
        System.out.println("The Average is: "+avg);
        
        max = number[0];
        min = number[0];
        
        for(int i = 0; i < n; i++)
        {
            if( max < number[i])
            {
                max = number[i];
            }
            if(min > number[i])
            {
                min = number[i];
            }
            
            
        }
        System.out.println("The Maximum is: "+max);
        System.out.println("The Minimum is: "+min);
            
        
        
        
    }
}