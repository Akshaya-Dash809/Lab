package Lab_13Oct;

//creating a child class
class Manager extends Employee{
//creating a constructor of manager class
	Manager(int id,String Name,String Address,long phone, double salary) {
		super(id,Name,Address,phone);
		this.basicSalary=salary;
	}
	//creating a method to calculate transport allowance of manager 
	void calculateTransportAllowance () {
		double transportAllowance = 15*basicSalary /100;
		 System.out.println("Transport allowance of Manager is: "+transportAllowance+"Rs");	
	}
	
}