package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		
		//your own custom exception: user defined exception
		
		
		String data = null;
		
		if(data == null) {
			
			throw new RuntimeException("DATANOTFOUNDEXCEPTION");
			
		}
		
		System.out.println("bye!!");
		
		
		
		
	}

}
