import java.util.*;
class Bank{
    String name,type;double accno,balance = 500.0;
    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number : ");
        accno = sc.nextDouble();System.out.println("Enter Name of Depositor : ");
        name = sc.next();System.out.println("Enter Account Type : ");
        type = sc.next();
    }
    public void deposit(int amt){
        double newbal = balance + amt;
        System.out.println("Balance Before Deposit : " + balance);
        System.out.println("Balance After Deposit : " + newbal);
        balance = newbal;
    }
    public void withdraw(int amt)
    {
        if(balance<500 || amt>500 )
        {
            System.out.println("Insufficient Balance");
            System.out.println("Available Balance is : " + balance);
        }
        else
        {
            double newbal = balance - amt;
            System.out.println("Balance Before Withdrawal : " + balance);
            System.out.println("Balance After Withdrawal : " + newbal);
            balance = newbal;
        }
    }
    public void display()
    {System.out.println("Balance is : " + balance);
}
public static void main(String argsp[])
{
    Bank b = new Bank();
    Scanner sc = new Scanner(System.in);
 
    int a,amt;
    do{
        System.out.println("Select:\n1 - Enter Account Details \n2 - Deposit \n3 - Withdraw \n4 - Balance \n5 -Exit");
        a = sc.nextInt();
        switch(a)
        {
            case 1:
            {
                b.read();
                break;
            }
            case 2:
            {
                System.out.println("Enter Deposit Amount : ");
                amt = sc.nextInt();
                b.deposit(amt);
                break;
            }
            case 3:
            {
                System.out.println("Enter Withdrawal Amount : ");
                amt = sc.nextInt();
                b.withdraw(amt);
                break;
            }
            case 4:
            {
                b.display();
                break;
            }
        }
    }
    while(a!=5);
}
}
   