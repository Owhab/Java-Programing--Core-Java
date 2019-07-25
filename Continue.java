class Continue{
    public static void main (String [] args){
        System.out.println("Now We are going to learn about Continue Statement in Java");
        for (int i = 1; i <= 100; i = i + 3){
            if(i == 13){
                continue;
            }
            if(i == 10){
                break;
            }
            
            System.out.println(i);
            
        }
        
        
        
    }
}