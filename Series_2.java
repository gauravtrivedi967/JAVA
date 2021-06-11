import java.util.Scanner; 
  
public class Series_2 { 
  
    public static void main(String[] args)  
    { 
        float sum = 0;
        Scanner in= new Scanner(System.in); 
        System.out.println("Enter the value of a and n");
        int a= in.nextInt();
        int n= in.nextInt();
        for (int i = 1; i <= n; ++i)
        { 
            sum += (i / Math.pow(a, i)); 
        } 
        System.out.println(sum); 
    } 
} 