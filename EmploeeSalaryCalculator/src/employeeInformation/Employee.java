package employeeInformation;
import java.util.Scanner;

public class Employee {

Scanner sc;
	

	public String emploeeName() {
		
		sc = new Scanner(System.in);
		String name;
		
		do {
			
			System.out.print("Please enter your name  :-");
			name = sc.nextLine();
			
			if(name.equalsIgnoreCase("Luis")) {

				break;

			}
			else if(name.equalsIgnoreCase("Hurayra")) {

				break;

			}

			else if(name.equalsIgnoreCase("Sangee")) {

				break;

			}
			else if(name.equalsIgnoreCase("Imran")) {

				break;

			}
			else if(name.equalsIgnoreCase("Nayan")) {

				break;

			}
			else if(name.equalsIgnoreCase("Imran")) {

				break;

			}
			else if(name.equalsIgnoreCase("Haque")) {

				break;

			}

			else {

				System.out.println("Employee Id does not Exist");

			}
			
		}while(true);
			
			
		
		return name;
	}

	public void emploeeName2() {

		sc = new Scanner(System.in);

		String name;

		System.out.print("Please enter your name  ;");
		name = sc.nextLine();

		System.out.println("Employee name is   "+name);


	}

	public int employeeId() {

		String name = emploeeName();

		int empId = 0;

		if(name.equalsIgnoreCase("Luis")) {

			empId = 100;
			System.out.println("Emplyee name is   :"+name);
			System.out.println("Your Employee ID is    :"+ empId);

		}
		else if(name.equalsIgnoreCase("Hurayra")) {

			empId=200;
			System.out.println("Emplyee name is   :"+name);
			System.out.println("Your Employee ID is    :"+ empId);

		}

		else if(name.equalsIgnoreCase("Sangee")) {

			empId=300;
			System.out.println("Emplyee name is   :"+name);
			System.out.println("Your Employee ID is    :"+ empId);

		}
		else if(name.equalsIgnoreCase("Imran")) {

			empId=400;
			System.out.println("Emplyee name is   :"+name);
			System.out.println("Your Employee ID is    :"+ empId);

		}
		else if(name.equalsIgnoreCase("Nayan")) {

			empId=500;
			System.out.println("Emplyee name is   :"+name);
			System.out.println("Your Employee ID is    :"+ empId);

		}
		else if(name.equalsIgnoreCase("Imran")) {

			empId=600;
			System.out.println("Emplyee name is   :"+name);
			System.out.println("Your Employee ID is    :"+ empId);

		}
		else if(name.equalsIgnoreCase("Haque")) {

			empId=700;
			System.out.println("Emplyee name is   :"+name);
			System.out.println("Your Employee ID is   :"+ empId);

		}

		else {

			System.out.println("Name Enter is :  "+name);
			System.out.println("Employee Id does not Exist");

		}


		return empId;
	}

	public double salary() {

		
		double salary;
		
		do {
			
			try {
				sc = new Scanner(System.in);
				System.out.print("Please enter a salary Amount of Employee:    ");
				 salary = sc.nextDouble();
				break;
				}
			    catch(Exception e) {
					System.out.println("Invalid Character, Please enter a correct amount");
					
					}
			
			
			
		}while(true);
		
		return salary;


	}

	public double calculateTax() {

		double salary = salary();
		double tax= 0;

		if(salary<10000) {

			tax=salary*.10;
			System.out.println("Your salary is   $:"+salary);
            System.out.println("Your tax is    $"+tax);
		}
		else if(salary>=10000 && salary<50000) {

			tax=salary*.20;
			System.out.println("Your salary is   $:"+salary);
            System.out.println("Your tax is    $"+tax);

		}

		else if(salary>=50000 && salary<100000) {

			tax=salary*.25;
			System.out.println("Your salary is   $:"+salary);
            System.out.println("Your tax is    $"+tax);

		}

		else if(salary>=100000 ) {

			tax=salary*.30;
			System.out.println("Your salary is   :$"+salary);
            System.out.println("Your tax    is   :$"+tax);

		}

		else  {

			System.out.println("Invaid salary");

		}


		return tax;

	}



}


