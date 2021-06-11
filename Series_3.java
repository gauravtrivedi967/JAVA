import java.util.*; 

public class Series_3
{ 
	public static void main (String[] args) 
	{   
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter the value of n and a");
        double n= in.nextDouble();
        double a= in.nextDouble();
		double res = 0, prev = 1; 
		for (int i = 1; i <= n; i++) 
			{  
				prev *= (a / i); 		
				res = res + prev; 
            } 
        System.out.println(res);    
	} 
} 