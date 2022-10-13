package Lab_13Oct;

public class EmployeeMain {

	public static void main(String[] args) {
		Manager mg =new Manager(126534,"peter","chennai india" , 273844, 65000);	//creating object of Manager class
		System.out.print("Manager "+mg.employeeName+"'s salary is: ");
		mg.calculateSalary();	//calling a method
		mg.calculateTransportAllowance();
		Trainee tr=new Trainee(29846,"jack","mumbai india", 442085, 45000);	//creating object of Trainee class
		System.out.print("Trainee "+tr.employeeName+"'s salary is: ");
	    tr.calculateSalary();
	    tr.calculateTransportAllowance();
	}
}