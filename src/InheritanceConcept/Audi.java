package InheritanceConcept;

public class Audi extends Car{
	
	@Override
	public void start() {
		System.out.println("audi -- start");
	}
	
	public void theftSafety() {
		System.out.println("audi -- theftSafety");
	}
	
	public final void speedTracking() {
		System.out.println("audi -- speedTracking");
	}
	
	

}
