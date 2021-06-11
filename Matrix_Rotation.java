import java.util.Scanner;
class Matrix_Rotation
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("M = ");
        int m = sc.nextInt();
        if(m < 3 || m > 9){
            System.out.println("SIZE OUT OF RANGE");
            return;
        }
        int a[][] = new int[m][m];
        System.out.println("Enter matrix elements:");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("ORIGINAL MATRIX");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        int r[][] = new int[m][m];
        int row = 0; int col = m - 1;
        for(int i = 0; i < m; i++){
            row = 0;
            for(int j = 0; j < m; j++){
                r[row++][col] = a[i][j];
            }
            col--;
        }
        System.out.println("MATRIX AFTER ROTATION");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                System.out.print(r[i][j] + "\t");
            }
            System.out.println();
        }
        int last = m - 1;
        int sum = a[0][0] + a[0][last] + a[last][0] + a[last][last];
        System.out.println("Sum of the corner elements = " + sum);
    }
}