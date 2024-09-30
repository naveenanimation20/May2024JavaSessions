package InheritanceConcept;

public class BMW extends Car {

	// bmw class var
	int speed = 200;
	int price = 500;

	// Method Overridding: poly(many)+Morphism(forms): RunTime(dynamic)
	// when we have a method in paernt class and the same method in child class:
	// 1. with the same name
	// 2. with the same number of parameters
	// 3. with the same sequence of parameters
	// 4. buss logic/numbers of lines in the method -- doesnt matter
	// 5. with the same return type

	// static methods can not be overridden but can be overloaded

	@Override
	public void start() {
		System.out.println("BMW -- start");
	}

	@Override
	public void start(int a) {
		System.out.println("BMW -- start");
	}

	public void autoParking() {
		System.out.println("BMW -- auto parking");
		applyBreak();// method chaining
		stop();// Inheritance
	}

	@Override
	public void applyBreak() {
		System.out.println("car -- applyBreak");
	}

	@Override
	public void engine() {
		System.out.println("BMW -- engine");
	}

	// method hiding
	public static void billing() {
		System.out.println("BMW -- billing");
	}

	private void getCarInfo() {
		System.out.println("BMW -- get info");
	}

	public void speedTracking() {
		System.out.println("bmw -- speedTracking");
	}

	public void bmwLoading() {
		Truck tr = new Truck();// BMW class is having Truck class object and able to access its
								// methods:Composition
		tr.heavyLoading();
		
		Audi au = new Audi();
		au.speedTracking();
		
	}

	@Override
	public void cruiceControl() {
		System.out.println("BMW -- cruiceControl");
	}

}
