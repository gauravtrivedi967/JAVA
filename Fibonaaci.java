class Fibonaaci
{  
    public static void main(String args[])  
    {    
     int n1=0,n2=1,n3,i,count=10;    
     System.out.print(n1+" "+n2);
        
     for(i=2;i<count;++i)  
     {    
      n3=n1+n2;    
      System.out.print(" "+n3);    
      n1=n2;    
      n2=n3;    
     }    
      
    }
}  
import java.util.Scanner;
public class Pattern_5
{            
    public static void main(String[] args)
    {
        int alphabet = 65;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows");
        int n=sc.nextInt();
                for (int i = 0; i<= n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
    }
}