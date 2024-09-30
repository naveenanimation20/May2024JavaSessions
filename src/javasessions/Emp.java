package javasessions;

public class Emp {
	
	String name;
	int salary;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp e1 = new Emp();
		e1.salary = 100;
		
		Emp e2 = new Emp();
		e2.salary = 200;
		
		Emp e3 = new Emp();
		e3.salary = 300;
		
		Emp e4 = new Emp();
		e4.salary = 400;
		
		
		System.out.println(e1.salary + e2.salary+ e3.salary + e4.salary);
		
		
		e2.salary = 500;
		
		System.out.println(e1.salary + e2.salary+ e3.salary + e4.salary);

		
		
	}

}
