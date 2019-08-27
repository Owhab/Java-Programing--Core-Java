import java.util.Scanner;

class ArrayForEach
{
    public static void main(String [] args)
    {
        
        Scanner in = new Scanner(System.in);
        
        
        String[] list = new String[3];
        
        int[] roll = new int[5];
        
        list[0] = "Owhab";
        list[1] = "Sohel";
        list[2] = "Jamil";
        
        roll[0] = 1;
        roll[1] = 2;
        roll[2] = 3;
        roll[3] = 4;
        roll[4] = 5;
        
        int sum = 0;
        
        for(String x : list)
            System.out.println(x);
        
        for(int y : roll)
            sum = sum + y;
            System.out.println("Sum of the Integer Array is: "+sum);
        
    }
}
