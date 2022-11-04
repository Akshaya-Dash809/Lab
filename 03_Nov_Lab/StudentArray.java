package Lab_03_Nov;

public class StudentArray {
	//declaring instance variables
		int studentNo ;
		String Name, Mail, Address;
		double fees;
		static double increasedFees;	// static member for increaseFees method
		
		
		//creating constructor for asssing the details to student
		StudentArray(int sn, String name, String mail, String address){		//passing values through overloded constructor
			this.studentNo=sn;
			this.Name=name;
			this.Mail=mail;
			this.Address=address;
		}
		
		//method for initializing fees to student 
		void fees(double f) {	
			fees=f;								// assigning passing value
			
		}
		
		//method for printing output
		void display() {							//for concation and SOP the output				
			this.fees=this.fees+increasedFees;				//updating fees before printing
			System.out.println("Id-" +this.studentNo+ " 	Name-" +this.Name+ " 	Mail-" +this.Mail+ " 	Address-" +this.Address + " 	Fees-" +fees);
		}
		
		//increasing fees method
		static void increaseFees(int n, double f) {
			if(f<2000) {							// condition 
				f=10*f/100;						// logic for increasing fees
				increasedFees=f;					//assigning the value to static instance member 		
			}
		}
		

		// main method
		public static void main(String[] args) {
			
			//instantiating Student type of array and declaring size
			StudentArray[] student = new StudentArray[5];
			
			//Instantiating objects of Student and initializing into array
			student[0]= new StudentArray(101,"Abc","abc@gmail.com","Cuttack, Odisha");
			student[1]= new StudentArray(102,"Def","def@gmail.com","Howrah, West Bengal");
			student[2]= new StudentArray(103,"Ghi","ghi@gmail.com","Bhopal, MP         ");
			student[3]= new StudentArray(104,"Jkl","jkl@gmail.com","Ameerpet, Hyderabad");
			student[4]= new StudentArray(105,"Mno","mno@gmail.com","Marathali,Banglore");

			//adding fees values
			student[0].fees(1134);
			student[1].fees(2235);
			student[2].fees(856);
			student[3].fees(1990);
			student[4].fees(2010);

			
			//increasing fees whose fees is less than 2000
			increaseFees(100,1064);
			increaseFees(102,957);
			increaseFees(103,1999);
			
			
			//traversing the array of student objects
			System.out.println("_____________________________Details of Students_______________________________\n");
			for(StudentArray i:student) {
				i.display();					//traversing with invocation of display
			}
			
			

		}

	}