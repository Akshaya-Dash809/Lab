package Lab_03_Nov;

public class Student {

	//declaring instance varibles
		int studentNo ;
		String Name, Mail, Address;
		double fees;
	
		//creating constructor for assigning the details to student
		Student(int sn, String name, String mail, String address){		//passing values through overloaded constructor
			this.studentNo=sn;
			this.Name=name;
			this.Mail=mail;
			this.Address=address;
		}
		
		//method for initializing fees to student 
		void fees(double f) {	
			if(f<2000) {							// condition 
				f=10*f/100;						// logic for increasing fees
				this.fees+=f;					//assigning the value to static instance member 		
			  
			}							
		}
		
		//method for printing output
		void display() {							//Student details as the output				
			//updating fees before printing
			System.out.println("Id-" +this.studentNo+ " Name-" +this.Name+ " 	Mail-" +this.Mail+ " 	Address-" +this.Address + " 	Increasing Fees-" + this.fees);
		}
		

		// main method
		public static void main(String[] args) {
			
			//instantiating Student type of array and declaring size
			Student[] student = new Student[5];
			
			//Instantiating objects of Student and initializing into array
			student[0]= new Student(101,"Abc","abc@gmail.com","Cuttack, Odisha");
			student[1]= new Student(102,"Def","def@gmail.com","Howrah, West Bengal");
			student[2]= new Student(103,"Ghi","ghi@gmail.com","Bhopal, MP         ");
			student[3]= new Student(104,"Jkl","jkl@gmail.com","Ameerpet, Hyderabad");
			student[4]= new Student(105,"Mno","mno@gmail.com","Marathali,Banglore");
			
			//adding fees values
			student[0].fees(1134);
			student[1].fees(2235);
			student[2].fees(856);
			student[3].fees(1990);
			student[4].fees(2010);
			
			//traversing the array of student objects
			System.out.println("_____________________________Student Details_______________________________\n");
			for(Student i:student) {  //for-each loop for initializing values
				i.display();	//print display method
			}
			
			

		}

	}