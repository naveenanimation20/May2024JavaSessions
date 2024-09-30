package EncapsulationConcept;


public class TestBank {

	public static void main(String[] args) {

		Bank b = new Bank("Pooja", 50, "21212121", "21212121");
		
		System.out.println(b.getAadharNumber());
		
		System.out.println(b.getAge());

		b.openAccount();
		
		
		Compnay.getDetails();
		
	}

}
