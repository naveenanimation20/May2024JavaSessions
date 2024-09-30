package javasessions;

public class Car {

	String name;
	int price;
	String modelNumber;

	static final int wheels = 4;// static and final(constant) class variable
	static final int keys = 2;

	public static void main(String[] args) {

		// static int p = 10;//local variable can not be static

		final int days = 7;
		// days = 10;
		int totalSalary = days * 100;

		System.out.println(totalSalary);

		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 60;
		c1.modelNumber = "x3";

		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 65;
		c2.modelNumber = "q3";

		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 25;
		c3.modelNumber = "civic";

		// how to access static variable:
		// 1. using the class name:
		System.out.println(Car.wheels);

		// 2. using directly:
		System.out.println(wheels);

		// System.out.println(Employee.id);

		// 3. can I access static var using the object ref name?
		System.out.println(c1.wheels);// The static field Car.wheels should be accessed in a static way

		// can not be changed coz of final
//		Car.wheels = 5;
//		Car.keys = 10;

		// how to access non static variable: using the object ref
		System.out.println(c1.name + " " + c1.price + " " + c1.modelNumber + " " + Car.wheels);
		System.out.println(c2.name + " " + c2.price + " " + c2.modelNumber + " " + Car.wheels);
		System.out.println(c3.name + " " + c3.price + " " + c3.modelNumber + " " + Car.wheels);
				
		
		
		
	}

}
