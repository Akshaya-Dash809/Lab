//Q.3)Develop a public java class and make sure nobody can create any object of this class from outside the class.

package Lab_13Oct;

public final  class JavaClass{

	final int a=10;
	final int b=20;
}

/*class Test1 extends JavaClass{
	public static void main(String[] args) {
	JavaClass j= new JavaClass();  //CE
	}
}
*/
/*
class Test2{
	public static void main(String[] args) {
		JavaClass j= new JavaClass();  //CE
	}
}
*/

//If a class is "Fianal class" then nobody can create any object of this class from outside the class.