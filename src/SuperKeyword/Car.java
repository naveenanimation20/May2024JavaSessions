package SuperKeyword;

public class Car extends Vehicle{

	int speed = 100;
	
	public Car() {
		System.out.println("Car -- default const...");
	}
	
	public Car(int a) {
		System.out.println("Car -- const..." + a);
	}
	
	public Car(int a, int b) {
		System.out.println("Car -- const..." + (a+b));
	}
	
	
	public void start() {
		System.out.println("Car -- start");
	}
	
	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
	public static void testing() {
		System.out.println("car -- testing");
	}
	
	
	//super:
	//1. is used to call parent class const... from the child class const...
	//2. but it should be used as first statement in child class const...
	//3. is used to call parent class vars/methods in the child class
	//4. if child class has overridden method (start), now If I want to call parent class (start) method:
	//we have to super.start()
	//5. if immediate parent class has not vars/methods, super can be used to call methods/vars from grandparent.
	//6. super is only applicable for child classes
	
	//this:
	//1. is used to initialize the class vars(global) with local variables
	//2. can be used in methods/const...
	//3. can use be used in the same class for the same class cosnt.. calling
	//4. this() in const... should be the first statement
	//5. this() and super() can not be together
	//6. Recursive const.. calling not allowed
	//7. we can return this keyword from a method/function: Builder Pattern
	
	
	
	
}
