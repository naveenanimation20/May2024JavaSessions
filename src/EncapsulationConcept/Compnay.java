package EncapsulationConcept;

public class Compnay {

	private Compnay() {

	}
	

	private static void getRevenue() {
		System.out.println("get rev");
	}
	
	public static void getDetails() {
		getRevenue();
	}

}




