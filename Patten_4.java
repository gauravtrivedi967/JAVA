public class Patten_4 
{
    public static void main(String[] args) {
        int n=5,c=1;
        for(int i=1;i<=n;i++) 
        {
            for(int j=1;j<=i;j++) {
                System.out.print(c + " ");
                ++c;
            }
            System.out.println();
        }
    }
}