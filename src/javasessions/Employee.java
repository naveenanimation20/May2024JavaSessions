package javasessions;

public class Employee {

	// class: category / template / blueprint
	// Object: physical entity

	// class vars: global vars/template vars
	String name;
	int age;
	double salary;
	boolean isPerm;
	char gender;
	
	static final int id = 1;
	
	public static void main(String[] args) {
		
		//create the object: using new keyword
		
		//new Employee();//this is the object/instance of the class
		//Employee: is a class
		//new: is a keyword
		//obj: object reference name
		
		Employee obj = new Employee();
		
		System.out.println(obj.name);
		System.out.println(obj.isPerm);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.gender);

		System.out.println("-----");
		
		obj.name = "Pooja";
		obj.age = 30;
		obj.salary = 90;
		obj.isPerm = true;
		obj.gender = 'f';
		
		System.out.println(obj.name);
		System.out.println(obj.isPerm);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.gender);
		
		Employee e1 = new Employee();
		e1.name = "Ravi";
		e1.age = 35;
		
		System.out.println(e1.name + " " + e1.age + " " + e1.isPerm + " " + e1.salary + " " + e1.gender);
		e1.salary = 60.22;
		System.out.println(e1.name + " " + e1.age + " " + e1.isPerm + " " + e1.salary + " " + e1.gender);


		//no reference objects
		new Employee().name = "Tom";
		new Employee().age = 45;
		System.out.println(new Employee().name);
		
		
		//null pointer object reference 
		Employee t1 = new Employee();
		t1 = null;
		//t1.name = "Naveen";//NPE
		//System.out.println(t1.name);
		
		
		//System.gc();//there is no fix guarantee that it will call the GC....
		
		
		
		Employee p1;//local var
		p1 = new Employee();
		
		String s = null;
		System.out.println(s.equals("naveen"));
		
				
		

	}

}
