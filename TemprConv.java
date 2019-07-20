import java.util.Scanner;

class TemprConv{
    public static void main(String []Args)
    {
        
        Scanner input = new Scanner(System.in);
        
        double celsious, fahrenheit;
        
        System.out.print("Please Enter The Fahrenheit Temperature: ");
        fahrenheit = input.nextDouble();
        
        celsious = 0.55555 * (fahrenheit - 32);
        
        
        System.out.println("The Celsious Temperature is: "+celsious);
        
        
        
        
        
    }
}