import java.util.Scanner;


class Array1
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Now We are going to learn about Array in Java Programing");
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("How many number you want: ");
        int n = in.nextInt();
        
        double[] number = new double[n];
        
        double sum = 0;
        
        System.out.println("Please ENter numbers: ");
        for(int i = 0; i < n; i++ )
        
        number[i] = in.nextDouble();
        

        for(int i = 0; i < n; i++ )
        {
            sum = sum + number[i];
        }
        System.out.println("Sum of the array is: "+sum);
        
        double avg = sum / n;
        System.out.println("The Average of the Array is: "+avg);
        
        
    }
}