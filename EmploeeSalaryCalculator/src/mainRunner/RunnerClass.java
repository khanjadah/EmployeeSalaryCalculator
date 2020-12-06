package mainRunner;
import java.util.Scanner;
import employeeInformation.Employee;
import intro.Introduction;

public class RunnerClass {

	public static void main(String[] args) {

		Introduction in = new Introduction();
		Employee em = new Employee();
		String willContinue;
		boolean a= false;
		
		
		in.begining();
		//em.employeeName();
		
		do {
		Scanner sc = new Scanner(System.in);
		em.employeeId();
		em.calculateTax();
		
		
	
		while(true) {
			System.out.print("Would you like to calculate tax for another employee (Yes or No):       ");
			willContinue = sc.nextLine();
			if(willContinue.equalsIgnoreCase("Yes")) {
				a = true;
				break;
				
			}
			else if(willContinue.equalsIgnoreCase("No")) {
			
				a = false;
				break;
			}
			else {
				System.out.println("Incorrect Input! Please enter Yes or No only.");
	
			}
			
		}
		
		
		}
		while(a==true);
	  
		in.end();
		
		
	 }


}
