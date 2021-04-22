class nestedif
{
    public static void main(String args[]) 
    { 
        int i = 20; 
  
        if (i == 20) 
        { 
         
            if (i < 25) 
                System.out.println("i is smaller than 25"); 

            if (i < 23) 
                System.out.println("i is smaller than 23 too"); 
            else
                System.out.println("i is greater than 25"); 
        } 
    } 
    
}
