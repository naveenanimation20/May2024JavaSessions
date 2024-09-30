package ExceptionHandling;

public class Employee {
	
	String name;

	public static void main(String[] args) {

		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			
			Employee e = new Employee();
			//e=null;
			e.name = "Naveen";//NPE
			
			int i = 9/0;//AE
			System.out.println("hello");
		}
		
//		catch(Error e ) {
//			System.out.println("some error is coming...");
//			e.printStackTrace();
//		}
				
		catch(ArithmeticException e) {
			System.out.println("AE is coming....");
			e.printStackTrace();
		}
//		catch(NullPointerException e) {
//			System.out.println("NPE is coming....");
//			e.printStackTrace();
//		}
		
//		catch(Exception e) {
//			System.out.println("some exception is coming");
//			e.printStackTrace();
//		}
//		
//		catch(Throwable e) {
//			System.out.println("some exception is coming");
//			e.printStackTrace();
//		}
		
		
		
		System.out.println("Bye!");
		
		
	}

}
