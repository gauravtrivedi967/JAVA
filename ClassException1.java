import java.io.IOError;
import java.io.IOException;
import java.util.*;
public class ClassException1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int emp_id,dept_id;
		System.out.println("Enter the name of the Employee");
		name = sc.nextLine();
		System.out.println("Enter the Employee ID of the Employee");
		emp_id = sc.nextInt();
		System.out.println("Enter the Department ID of the Employee");
		dept_id = sc.nextInt();
		try {
			if((!Character.isUpperCase(name.charAt(0))) || (emp_id<2001 || emp_id>5001) || (dept_id<1 || dept_id>5)) {
				throw new InvalidException();
			}
			else {
				System.out.println("Name of Employee : - " + name);
				System.out.println("Employee ID of Employee : - " + emp_id);
				System.out.println("Department ID of Employee : - " + dept_id);
			}
		}
		catch(InvalidException e) {
			System.out.println("Conditions are not satisfied!!");
		}
    }
}