class buffer
{
 public static void main(String[] args)
 {
    
    StringBuffer sb = new StringBuffer("JAVA");
         
        long startTime = System.currentTimeMillis();
         
        for(int i = 0; i <= 10000; i++)
        {
            sb.append("J2EE");
        }
         
        long endTime = System.currentTimeMillis();
         
        System.out.println("Time taken by StringBuffer class : "+(endTime - startTime)+" ms");
        
 }

}
