package AccMod1;

public class Car {

	// data members: vars + methods: rule will be same
	String name;
	public int price;
	protected String color;
	private String chasisNum;
	
	
	public void billing() {
		System.out.println("car -- billing");
	}
	
	
	protected Car() {
		
	}
	
	
	

	public static void main(String[] args) {

		Car c = new Car();
		c.chasisNum = "123";

	}

}



