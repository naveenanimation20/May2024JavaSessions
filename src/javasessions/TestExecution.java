package javasessions;

public class TestExecution {

	//a method is calling itself -- recursive function : recursion
	public static void getNum() {
		System.out.println("get num");
		getNum();
	}
	
	
	
	public static void main(String[] args) {

		TestExecution.getNum();
		
		
	}

}
