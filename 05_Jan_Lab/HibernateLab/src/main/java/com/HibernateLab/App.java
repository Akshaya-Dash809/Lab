package com.HibernateLab;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	    public static void main( String[] args )
	    {
	    	SessionFactory s1= new Configuration().configure().buildSessionFactory();
	    	//Opens an connection with db and session object perform CRUD
	    	Session ses = s1.openSession();
	    	//Operation performed in db, save permanent
	    	Transaction t1 = ses.beginTransaction();
	    	//Create object of persistent class
	    	Employee  emp = new  Employee();
	    	Employee  emp1 = new  Employee();
	    	Employee  emp2 = new  Employee();
	    	Employee  emp3 = new  Employee();
	    	Employee  emp4 = new  Employee();
	    	//Use object to enter data in table using setter method
	    	emp.setEmpId(101);
	    	emp.setEmpFirstName("Akshaya");
	    	emp.setEmpLastName("Dash");
	    	emp.setEmpEmail("akshaya1@gmail.com");
	    	emp.setEmpPhone(1234567);
	    	emp.setEmpAddr("Odisha");
	    	emp.setEmpSalary(10000);
	    	emp.setEmpDept("IT");
	    	ses.save(emp);
	    	emp1.setEmpId(102);
	    	emp1.setEmpFirstName("Sourav");
	    	emp1.setEmpLastName("Das");
	    	emp1.setEmpEmail("Sourav@gmail.com");
	    	emp1.setEmpPhone(9832167);
	    	emp1.setEmpAddr("Delhi");
	    	emp1.setEmpSalary(12000);
	    	emp1.setEmpDept("CS");
	    	ses.save(emp1);
	    	emp2.setEmpId(103);
	    	emp2.setEmpFirstName("Soumya");
	    	emp2.setEmpLastName("Chatterjee");
	    	emp2.setEmpEmail("soumya@gmail.com");
	    	emp2.setEmpPhone(5431278);
	    	emp2.setEmpAddr("Kolkata");
	    	emp2.setEmpSalary(30000);
	    	emp2.setEmpDept("IT");
	    	ses.save(emp2);
	    	emp3.setEmpId(104);
	    	emp3.setEmpFirstName("Niladri");
	    	emp3.setEmpLastName("Chowdhury");
	    	emp3.setEmpEmail("niladri@gmail.com");
	    	emp3.setEmpPhone(324178);
	    	emp3.setEmpAddr("Mumbai");
	    	emp3.setEmpSalary(43000);
	    	emp3.setEmpDept("Finance");
	    	ses.save(emp3);
	    	emp4.setEmpId(105);
	    	emp4.setEmpFirstName("Misbah");
	    	emp4.setEmpLastName("Chowdhury");
	    	emp4.setEmpEmail("misbah@gmail.com");
	    	emp4.setEmpPhone(8764321);
	    	emp4.setEmpAddr("Pune");
	    	emp4.setEmpSalary(50500);
	    	emp4.setEmpDept("HR");
	    	//session object is used to save the persistent object
	    	ses.save(emp4);
	    	//transaction object to commit changes
	    	t1.commit();
	    	ses.close();
	    }}