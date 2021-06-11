public class Series_1
{ 
    public static void main(String args[])
    {   
        int N = 10;  
        for (int i = 1; i <= N; i++) 
         {  
            System.out.print(" "+((i % 2 == 0) ? (i - 1) : (i + 1)));  
        }  
    }   
}  