/*Qus-2 :Write a java class to develop an employee class object & initialized the emp name & emp Id for 5 Emp. now write another class having name and from this class you have to create 5 employee objects but you are not allowed to use new keyword.
 * Write a java class to develop an employee class object & initialized the emp name & emp Id for 5 Emp.
 *  now write another class having name and from this class
 *  you have to create 5 employee objects but you are not allowed to use new keyword.
 */

package Lab_13Oct;

  class Employee11 {
  static String empName;
  static int empId;
	static void  empDetails(String name,int id) { //method to print employee details
		empName=name;
		empId=id;
		System.out.println(empName+" "+empId);
	}
}
 class EmployeeClass extends Employee11{
	 public static void main(String[] args) {
		 Employee11.empDetails("Abc", 100); //obj 1
		 Employee11.empDetails("Def", 101); //obj 2
		 Employee11.empDetails("Ghi", 102); //obj 3
		 Employee11.empDetails("Jkl", 103); //obj 4
		 Employee11.empDetails("Mno", 104); //obj 5
		 
		
	}
 }
