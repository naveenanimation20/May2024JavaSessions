package InterfaceConcept;

public interface UKMedical {

	public void entServices();

	public void pediaServices();

	public void dermaServices();
	
	public void emergencyServices();
	
	
	public static void billing() {
		System.out.println("UK Medical -- billing");
	}

	
	default void medicalInsurance(int a) {
		System.out.println("UK -- medical insurance");
	}

}
