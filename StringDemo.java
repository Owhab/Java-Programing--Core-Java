class StringDemo
{
    public static void main(String [] args)
    {
        String name = "";
        String Name = new String("abdul Owhab");
        
        
        
        System.out.println("Name is : "+name);
        System.out.println("Name is : "+Name);
        
        
        
        int len1 = name.length();
        System.out.println("Length of name is : "+len1);
        
        int len2 = Name.length();
        System.out.println("Length of Name is : "+len2);
        
        boolean b = name.equals(Name);
        
        System.out.println(b);
        
        
        
        if(name.equalsIgnoreCase(Name))
        {
            System.out.println("Equals");
        }
        else
        {
            System.out.println("Not Equals");
            
            
        }
        
        boolean m = name.isEmpty();
        
        System.out.println("name is Empty? "+m);
        
        String Name1 = "Abdul ";
        String Name2 = "Owhab";        
        String FullName = Name1.concat(Name2);
        
        System.out.println("Full Name : "+FullName);
        
        
        String Upper = FullName.toUpperCase();
        System.out.println(Upper);
        
        String Lower = FullName.toLowerCase();
        System.out.println(Lower);
        
        boolean start = Name1.startsWith("A");
        System.out.println(start);
        
        boolean ends = Name1.endsWith(" ");
        System.out.println(ends);
        
        
        String[] names = {"Owhab", "Siful", "Shamim", "Robi", "Rafi", "Nehal"};
        
        for(String x : names)
        {
            System.out.println(x);
            
        }
        
        String[] Students = {"Shakil", "Mozammel", "Rakib", "Rafti", "Nowshad", "Atik", "Shaiful"};
        
        for(String y : Students)
        {
            System.out.println(y);
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        String Me = "        I Love my     Country Very Much";
        
        char ch = Me.charAt(5);
        
        System.out.println(ch);
        
        int a = Me.codePointAt(0);
        System.out.println(a);
        
        int i = Me.indexOf("C");
        System.out.println(i);
        
        int g = Me.lastIndexOf("e");
        System.out.println(g);
        
        
        String trim = Me.trim();
        System.out.println(trim);
        
        
    }
}