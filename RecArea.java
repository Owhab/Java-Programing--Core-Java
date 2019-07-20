import java.util.Scanner;
class RecArea{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        int length, width, Area;
        
        System.out.print("Please Enter the Length of a Rectangular: ");
        length = input.nextInt();
        
        System.out.print("Please Enter the Width of a Rectangular: ");
        width = input.nextInt();
        
        Area = length * width;
        
        System.out.println("The area of a Rectangular is: "+Area);
        
        
        
        
        
        
        
    }
    
    
}