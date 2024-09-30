package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 0;
			
		} 

		catch (ArithmeticException e) {
			System.out.println("AE is coming...");
		} 
		
		finally {
			System.out.println("Im in finally block");
		}
		
		
		System.out.println("bye");
		
		
		//use case:
		
		//1. make the connection DB: un, pwd, ip:port: try-catch
		//2. hit the SQL query: try-catch
		//3. result from DB: try-catch
		//4. display the data on UI: try-catch
		//5. logout
		
		//finally{
				//6. close connection with DB
				//}
		
		//reading from excel/file
		
		
		
		

	}

}
