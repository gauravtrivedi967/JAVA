import java.util.Scanner;
public class Pattern_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: "); 
        int n = sc.nextInt();
        int alphabet = 65;
        for (int i= n-1; i>=0 ; i--)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print((char) alphabet + " ");
                alphabet++;    
            }
            System.out.println();
        }
    }   
}