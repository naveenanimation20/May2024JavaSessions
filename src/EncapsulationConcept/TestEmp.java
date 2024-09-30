package EncapsulationConcept;

public class TestEmp {

	public static void main(String[] args) {

//		Employee obj = new Employee();
//		
//		obj.setName("Tom");
//		String n = obj.getName();
//		System.out.println(n);
//		
//		
//		obj.setAge(20);
//		System.out.println(obj.getAge());
		
		//Create - POST
		Employee obj = new Employee("Pooja", 20, 12.33, true);
		
		//Retrieve - GET
		System.out.println(obj.getName() + " " + obj.getAge() + " " + obj.getSalary() + " " + obj.isPerm());
		
		
		//Update -- PUT
		obj.setAge(21);
		obj.setSalary(25);
		
		//Retrieve - GET
		System.out.println(obj.getName() + " " + obj.getAge() + " " + obj.getSalary() + " " + obj.isPerm());
		
		
		//
		Employee obj1 = new Employee("Veena", 30, 22.33, false);
		System.out.println(obj1.getName() + " " + obj1.getAge() + " " + obj1.getSalary() + " " + obj1.isPerm());

		obj1.setPerm(true);
		
		System.out.println(obj1.getName() + " " + obj1.getAge() + " " + obj1.getSalary() + " " + obj1.isPerm());

		
		//browser:
		Browser br = new Browser();
		br.launchBrowser();
		
		//login:
		//POST - create credes
		LoginPage lp1 = new LoginPage("naveen@gmail.com", "naveen@123");
		
		lp1.doLogin();
		
		System.out.println(lp1.getUserName() + " " + lp1.getPassword());
		
		lp1.setPassword("naveen@9090");
		
		System.out.println(lp1.getUserName() + " " + lp1.getPassword());
		
		System.out.println("------");
		//
		LoginPage lp2 = new LoginPage("piyush@gmail.com", "pityus@123");
		lp2.doLogin();


	}

}
