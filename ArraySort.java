import java.util.Arrays;

class ArraySort
{
    public static void main(String [] args)
    {
        
        int[] number = {2, 45, 3, 45, 24, 45, 456, 23, -43, 324, 45, 23, 34};
        
        Arrays.sort(number);
        
        System.out.println("Ascending Numbers: ");
        for(int i = 0; i < 13; i++)
        {
            System.out.println(number[i]);
        }
        
        System.out.println("Descending Numbers: ");
        for(int i = 12; i >= 0; i--)
        {
            System.out.println(number[i]);
        }
        
        
        String[] Students = {"Sami", "Owhab", "Abdul", "Sumon", "Naser", "Jamal", "Rubel"};
        Arrays.sort(Students);
        
        
        System.out.println("Ascending Student's Names: ");
        
        for(int i = 0; i < 7; i++)
        {
            System.out.println(Students[i]);
        }
        
        System.out.println("Descending Student's Names: ");
        for(int i = 6; i >= 0; i--)
        {
            System.out.println(Students[i]);
        }
        
        
    }
}