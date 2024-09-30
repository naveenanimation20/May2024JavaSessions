package BuilderPattern;

public class AppTest {

	public static void main(String[] args) {

		
		Application app = new Application();
		
		//workflow chain scenario: Builder pattern
		
		//1.
		app.login("naveen@gmail.com", "naveen@123")
			.search("macbook pro")
				.addToCart("macbook pro 16 inches")
					.doPayment("naveen@okicici")
						.generateOrder()
							.logout();
		
		
		//2.
		app.login("naveen@gmail.com", "naveen@123")
			.search("tshirt", 1000)
				.addToCart("nike tshirt")
					.logout();
		
		//3. 
		app.login("naveen@gmail.com", "naveen@123")
		.search("tshirt", 1000)
			.addToCart("nike tshirt")
				.doPayment("7878 8888 9999 7676", 111)
					.generateOrder()
							.logout();	
					

		//4. 
		app.login("naveen@gmail.com", "naveen@123")
			.logout();
		
		//5. 
		app.login("vibha@gmail.com", "vibha@123");
		
		
		//6. 
		app.login()
			.search("keyboard")
				.addToCart("keyboard apple")
					.doPayment("vibha@hdfc")
						.generateOrder()
							.logout().
							login("naveen@gmail.com", "naveen@123")
							.search("tshirt", 1000)
							.addToCart("nike tshirt")
								.doPayment("7878 8888 9999 7676", 111)
									.generateOrder()
											.logout();	
								
		
		
			
//this:
		//1. to init the class variable within const.. or method
		//2. can be used with getter/setter: encapsulation
		//3. same class const... calling
		//return this from a function: builder pattern
		
		
		
	}

}
