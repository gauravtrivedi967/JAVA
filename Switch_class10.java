import java.util.Scanner;
class Switch_class10
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("1. Composite Number");
        System.out.println("2. Smallest Digit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
            System.out.print("Number: ");
            int num = sc.nextInt();
            int f = 0;
            for(int i = 1; i <= num; i++){
                if(num % i == 0)
                    f++;
            }
            if(f > 2)
                System.out.println(num + " is composite.");
            else
                System.out.println(num + " is not composite.");
            break;
            case 2:
            System.out.print("Number: ");
            num =sc.nextInt();
            int small = num % 10;
            while(num != 0){
                int digit = num % 10;
                if(small > digit)
                    small = digit;
                num /= 10;
            }
            System.out.println("Smallest digit: " + small);
            break;
            default:
            System.out.println("Invalid choice!");
        }
    }
}