package InterfaceConcept;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {
	
	
	static final int MIN_FEE = 50;

	//US
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");
	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");
	}

	//UK
	@Override
	public void entServices() {
		System.out.println("FH -- entServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");

	}

	@Override
	public void dermaServices() {
		System.out.println("FH -- dermaServices");

	}

	//India
	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("FH -- orthoServices");
		
	}

	@Override
	public void nuroServices() {
		System.out.println("FH -- nuroServices");
		
	}
	
	//Individual:
	public void medicalTraining() {
		System.out.println("Fh -- medical training");
	}
	
	public void pathalogyServices() {
		System.out.println("Fh -- pathalogyServices");
		medicalInsurance();

	}

	//common
	@Override
	public void emergencyServices() {
		System.out.println("Fh -- emergencyServices");		
	}
	
	
	//method hiding
	public static void billing() {
		System.out.println("FH -- billing");
		
	}
	
	
	//trying to override default method of interface with public:
//	@Override
//	public void medicalInsurance() {
//		System.out.println("FH -- medical insurance");
//	}

	//WHO
	@Override
	public void covidVaccination() {
		System.out.println("FH -- covidVaccination");
	}

	@Override
	public int test(int a) {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public int test(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void medicalRD() {
		System.out.println("FH R&D");
	}

	
	

}