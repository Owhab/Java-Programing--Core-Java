class LoopSum{
    public static void main (String [] args)
    {
        
        int sum = 0;
        
        for (int i = 1; i <= 10; i++)
        {
            sum = sum + i;
            
        }
        
        System.out.println("The Summation of 1 to 10 Number is: "+sum);
        
        
        for (int i = 1; i <= 100; i++)
        {
            sum = sum + i;
            
        }
        
        System.out.println("The Summation of 1 to 100 Number is: "+sum);
        
    }
    
    
    
}