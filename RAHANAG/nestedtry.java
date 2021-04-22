class nestedtry
{
    public static void main(String[] args)
    {
        String[] s = {"hello", "456", null, "welcome"};  
 
        for (int i = 0; i < s.length; i++)
        {
            try   
            {
                int a = s[i].length();  
 
                try  
                {
                    a = Integer.parseInt(s[i]);   
                }
                catch (NumberFormatException ex)  
                {
                    System.out.println("NumberFormatException will be caught here");
                }
            }
            catch(NullPointerException ex)  
            {
                System.out.println("NullPointerException will be caught here");
            }
        }
    }
}
    

