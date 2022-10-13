package Lab_13Oct;

public class Employee{
	int employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	final double specialAllowance=250.80;
    final double hra=1000.50;
	//creating a constructor
	 Employee(int Id,String Name,String Address,long Phone){ 
		this.employeeId=Id;
		this.employeeName=Name;
		this.employeeAddress=Address;
		this.employeePhone=Phone;
	}
	
	 //creating a method to calculate salary
	void calculateSalary () {
		double salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100); 
		System.out.println(salary);
	}
	//creating a method to calculate transport allowance
	void calculateTransportAllowance () {
		 double transportAllowance = 10*basicSalary/100;
		 System.out.println("Transport allowance of Trainee is: "+transportAllowance+"Rs");
	}
}