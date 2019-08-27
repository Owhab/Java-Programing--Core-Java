import java.util.Arrays;

class ArraySort2{
    public static void main(String [] args){
        
        int[] numbers = {1, 2, 35, 45, 43, 23, 343, 76, 78, -98, 67, -89};
        
        Arrays.sort(numbers);
        
        System.out.println("After Ascending Numbers are: ");
        
        for(int i = 0; i <= 11; i++)
        {
            System.out.println(numbers[i]);
        }
        
        System.out.println("After Descending Numbers are: ");
        for(int i = 11; i >= 0; i--)
        {
            System.out.println(numbers[i]);
        }
        
        
        
        
    }
}