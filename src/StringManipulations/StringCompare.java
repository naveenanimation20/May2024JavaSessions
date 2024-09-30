package StringManipulations;

public class StringCompare {
	
	
	
	

	public static void main(String[] args) {

		//String literals
		String s1 = "hello selenium";
		
		//using new
		String s2 = new String("hello selenium");
		
		
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//true
		
		
		String s3 = "hello selenium";
		
		System.out.println(s1 == s3);//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s2 == s3);//false
		
		String s4 = "hello Selenium";
		
		String str = new String("testing");//2-->heap + SCP(testing)
		String st = "testing";//SCP --> 0
		String st1 = "Testing";
		
		
		//
		String t1 = "hello";
		t1.concat("automation");
		System.out.println(t1);//hello
		
		String t2 = "helloautomation";
		System.out.println(t1.equals(t2));
		
		String t3 = new String("cypress");//2 -- HEAP + SCP
		
		
		
		
		
		
		
	}

}
