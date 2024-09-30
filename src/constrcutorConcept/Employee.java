package constrcutorConcept;

public class Employee {

	String name;
	int age;
	double salary;
	char gender;
	String dob;
	boolean isPerm;
	
	static final String compName = "IBM";
		

	// constructor:
	// const... name will be same as the class name but function name could be anything
	// it looks like a function but its not a function
	// const.. can not return anything, can not be void also -- there is no return but function may or may not return
	// avoid buss logic in const...but function should have the buss logic
	
	// const.. is used to initialize the class (instance) variables with the help of local variables using this keyword
	
	// const.. can be overloaded, same with function also
	
	// const.. will be called automatically when we create the object of the class
	//but function will be called using the object ref name or static function will be called using class name
	
	// const... will help to restrict the object creation
	
	
	//const vs function:
	
	
//	public void Employee() {
//		
//	}
	

//	public Employee() {//0 param const.. default const..
//		System.out.println("default const...");
//		
//	}
//	
//	public Employee(int a) {//1 param const..
//		System.out.println("1 param const..." + a);
//		
//	}
//	
//	public Employee(double a) {//1 param const..
//		System.out.println("1 param const..." + a);
//		
//	}
	
//	public Employee() {//default
//		
//	}

	public Employee(String name, int age) {
		// this.Global=Local
		this.name = name;
		this.age = age;
	}

	public Employee(String name, int age, double salary, char gender) {
		// this.Global=Local
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}

	public Employee(String name, int age, char gender, String dob) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
	}

	public Employee(String name, int age, double salary, char gender, String dob, boolean isPerm) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.dob = dob;
		this.isPerm = isPerm;
	}

	public static void main(String[] args) {

		Employee e1 = new Employee("Priya", 30);
		System.out.println(e1.name + " " + e1.age + " " + e1.salary + " " + e1.dob + " " + e1.isPerm);
		e1.salary = 23.44;
		System.out.println(e1.name + " " + e1.age + " " + e1.salary + " " + e1.dob + " " + e1.isPerm);


		Employee e2 = new Employee("Devesh", 25, 30.66, 'm');
		System.out.println(e2.name + " " + e2.age + " " + e2.salary + " " + e2.dob + " " + e2.isPerm + " " + e2.gender);
		
		Employee e3 = new Employee("naveen", 25, 12.33, 'm', "01-01-2000", true);
		System.out.println(e3.name + " " + e3.age + " " + e3.salary + " " + e3.dob + " " + e3.isPerm + " " + e3.gender);


	}

}
