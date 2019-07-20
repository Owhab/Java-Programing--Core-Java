import java.util.Scanner;
class hello{
public static void main(String []args)
{

    Scanner input = new Scanner(System.in);
    
    
    String Name, Institute, Dept, Semester, Shift;
    int Roll, Reg, Phone;
    
    System.out.print("What is your name: ");
    Name = input.nextLine();
    
    System.out.print("Please Enter Your Roll No: ");
    Roll = input.nextInt();
    
    System.out.print("Please Enter Your Registration No: ");
    Reg = input.nextInt();
    
    System.out.print("Which Institute you are studying in: ");
    Institute = input.nextLine();
    
    System.out.print("Which Department you are in: ");
    Dept = input.nextLine();
    
    //System.out.print("Which Semester You are in: ");
    //Semester = input.nextLine();
    
    System.out.print("Which Shift You are in: ");
    Shift = input.nextLine();
    
    System.out.print("Please Enter Your Phone Number: ");
    Phone = input.nextInt();
    
    
    
    
    
    
    
    System.out.println("The Name of Student is : "+Name);
    System.out.println("Your Roll No is: "+Roll);
    System.out.println("Your Registration No is: "+Reg);
    System.out.println("You are studying at : "+Institute);
    System.out.println("Your Department is: "+Dept);
    //System.out.println("Your Semester is: "+Semester);
    System.out.println("Your Shift is: "+Shift);
    System.out.println("Your Contact Number is: "+Phone);
    
    
    
    
    
    
    

}
}