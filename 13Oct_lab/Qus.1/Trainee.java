package Lab_13Oct;

//creating another child class of Employee
class Trainee extends Employee{
	Trainee (int id, String Name, String Address, long Phone,double salary) {
		super(id,Name,Address,Phone);
		this.basicSalary=salary;
	}
}