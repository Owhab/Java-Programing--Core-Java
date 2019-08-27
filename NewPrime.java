import java.util.Scanner;
class NewPrime{
    
    public static void main(String [] args){
        
        Scanner in = new Scanner(System.in);
        
        int x, y, count = 0;
        
        System.out.print("Enter the first number: ");
        x = in.nextInt();
        
        System.out.print("Enter the last number: ");
        y = in.nextInt();
        
        for(int i = x; i <= y; i++){
            
            for(int j = 2; j <= i-1; j++){
                
                if(i%j==0){
                    
                    count++;
                    break;
                }
                
            }
            if(count==0)
                System.out.println(i);
            count = 0;
        }
    }
}