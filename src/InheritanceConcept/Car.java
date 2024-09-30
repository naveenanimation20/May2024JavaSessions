package InheritanceConcept;


//final class -- to prevent inheritance
public class Car extends Vehicle{
	
	final int speed = 100;
	int price = 70;

	

	public void start() {
		System.out.println("car -- start");
	}
	
	public void start(int a) {
		System.out.println("car -- start");
	}

	public void stop() {
		System.out.println("car -- stop");
	}

	// final methods can not be overridden -- prevent method overridding
	public final void refuel() {
		System.out.println("car -- refuel");
	}

	public void applyBreak() {
		System.out.println("car -- applyBreak");
	}

	// static methods can not be overridden
	public static void billing() {
		System.out.println("car -- billing");
	}

	// private methods can not be overridden
	private void getCarInfo() {
		System.out.println("Car -- get info");
	}

	public void getInfo() {
		getCarInfo();
	}
	
	@Override
	public void cruiceControl() {
		System.out.println("car -- cruiceControl");
	}
	
}

