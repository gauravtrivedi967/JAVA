public class Pattern_2{

    public static void main(String[] args) {
        int n=5,k=0;

        for(int i=1;i<=n;++i,k=0) 
        {
            for(int space=1;space<=n-i;++space) 
            {
                System.out.print("  ");
            }

            while(k !=2*i-1) 
            {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}