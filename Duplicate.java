import java.util.*;
public class Duplicate
 {  
    public static void main(String[] args) 
    {         
          
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
            a[i] = s.nextInt();  
        System.out.println("Duplicate elements in given array: ");  
        for(int i = 0; i < n; i++) {  
            for(int j = i + 1; j < n; j++) {  
                if(a[i] == a[j])  
                    System.out.println(a[j]);  
            }  
        }  
    }  
}  