/*
 * Problem 2. 
Banking Operations relate a class with customer private instance 
variables as accountNumber,accountName,accountBalance and 
create methods as
1. create account => accnumber,accname,accbal
2. setAmount=> add amount to accbal
3. getAmount=>print accbal and name account
4. withDrawAmount()=to withdraw amount from accBalance
create a main class to use customer and create atleast two 
customers
*/
//Problem 2
package Lab_20Oct;
public class Customer {

	private int accountNumber;
	private String accountName;
	private double accountBalance;
	
	public void createAccount(int accnumber,String accname,double accbal) {
		//create account => accnumber,accname,accbal
		this.accountNumber=accnumber;  
		this.accountName=accname;
		this.accountBalance=accbal;
	}
	public void setAmount(double amount) { //setAmount=> add amount to accbal
		accountBalance += amount;
	}
	public double getAmount() {  //getAmount=>print accbal and name account
		return accountBalance;
	}
	public double withDrawAmount(double amount){ //withDrawAmount()=to withdraw amount from accBalance
		accountBalance -= amount;
		return amount;
	}
	
	public static void main(String[] args) {
		Customer c1= new Customer();  //obj 1
		Customer c2= new Customer();  //obj 2
		c1.createAccount(100001,"Mr. Abc",1000.0);
		c2.createAccount(500005,"Mr. Def",5000.0);
		
		c1.setAmount(100.0);
		System.out.println("Customer name : "+c1.accountName);
		System.out.println("Account Balance : rs "+c1.getAmount());
		
		System.out.println("                               ");
		c2.setAmount(500.0);
		System.out.println("Customer name : "+c2.accountName);
		System.out.println("Account Balance : rs "+c2.getAmount());
	}
}
