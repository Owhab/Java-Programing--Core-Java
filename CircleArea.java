import java.util.Scanner;
class CircleArea{
    public static void main (String [] Args){
        Scanner input = new Scanner(System.in);
        
        int  radious;
        double pie, Area;
        
        pie = 3.1416;
        
        System.out.print("Please Enter the radious of a circle: ");
        radious = input.nextInt();
        
        Area = pie*radious*radious;
        
        System.out.println("The Area of a Circle is: "+Area);
        
        
        
        
        
    }
}