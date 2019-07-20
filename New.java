import java.util.Scanner;
class New{


public static void main(String [] Args){
    Scanner input = new Scanner(System.in);
    int a, b, c, d, sum, sub, mul, rem;
    
    
    
    System.out.print("Please Enter the value of a: ");
    a = input.nextInt();
    
    System.out.print("Please Enter the value of b: ");
    b = input.nextInt();
    
    System.out.print("Please Enter the value of c: ");
    c = input.nextInt();
    
    System.out.print("Please Enter the value of d: ");
    d = input.nextInt();
    
    sum = a + b + c + d;
    sub = (a + b) - (c + d);
    mul = a * b * c * d;
    double div = (double) a / b;
    rem = (a * b) % (c * d);
        
    
    System.out.printf("The Summation of %d, %d, %d and %d is : %d \n", a, b, c, d, sum);
    System.out.println("The Subtraction is : "+sub);
    System.out.println("The Multiplication is : "+mul);
    System.out.println("The Division is : "+div);
    System.out.println("The Reminder is : "+rem);
    
    



}
}