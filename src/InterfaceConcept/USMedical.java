package InterfaceConcept;

public interface USMedical extends WHO{
	
	int MIN_FEE = 10;
	//interface vars are static and final in nature by default
	
	//only method declaration: no method body
	//only method prototype
	//abstract methods: a method without body(only for non static methods)
	//can not create the object of interface
	//can not create the const.. of the Interface
	//static method with body
	
	
	
	public void physioServices();
	
	public void oncologyServices();
	
	public void dentalServices();
	
	public void emergencyServices();
	
	public int test(int a);
	
	public int test(int a, int b);

	
	
	//private non static method: abstract?: not allowed
	//private void freeMedical();
	
	//final method: abstract?: not allowed
	//public final void medicalResults();
	

	//can I have a method with body? : Yes
	//after JDK 1.8:
	// 1. can have a method with body but with static method:
	public static void billing() {
		System.out.println("US Medical -- billing");
	}
	
	// 2. can have a non static with method body but it should written with default keyword:
	//can we override the default method of Interface?: YES
	default void medicalInsurance() {
		System.out.println("US -- medical insurance");
	}
	
	
}
