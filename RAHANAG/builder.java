class builder
{
    public static void main(String[] args)
 {
    
    StringBuilder sb = new StringBuilder("JAVA");
         
        long startTime = System.currentTimeMillis();
         
        for(int i = 0; i <= 10000; i++)
        {
            sb.append("J2EE");
        }
         
        long endTime = System.currentTimeMillis();

         
        System.out.println("Time taken by StringBuilders class : "+(endTime - startTime)+" ms");
        
 }

}
