package javasessions;

public class Customer {

	// WAF: 0 to 100
	// create a function: this will return the customer marks on the basis of given
	// customer name
	// name: getCustomerMarks(String name)
	// return: marks(int)

	public int getCustomerMarks(String name) {

		System.out.println("customer name is : " + name);
		
		int marks = -1;

		if (name.trim().equalsIgnoreCase("piyush")) {
			//return 90;
			marks = 90;
		} 
		else if (name.trim().equalsIgnoreCase("ravi")) {
			//return 95;
			marks = 95;
		} 
		else if (name.trim().equalsIgnoreCase("naveen")) {
			//return 10;
			marks = 10;
		} 
		else {
			System.out.println("plz pass the right customer name..." + name);
			return -1;

		}
		
		return marks;

	}

	//PSVM - String []
	public static void main(String a[]) {

		Customer c = new Customer();
		
		int marks = c.getCustomerMarks("naveen");
		System.out.println(marks);
		
		
		if(marks>=0) {
			System.out.println("print the marksheet");
		}
		
		
	}
	
	
	
	

}
