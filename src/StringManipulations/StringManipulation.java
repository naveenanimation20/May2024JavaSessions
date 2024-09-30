package StringManipulations;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) { 

		
		String str = "hi this is my java code and i am so happy";
		
		System.out.println(str.length());//41
		int len = str.length();

		System.out.println("Li = " + 0);//0
		System.out.println("Hi = " + (len-1));//40
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(40));
		//System.out.println(str.charAt(41));//SIOB
		//System.out.println(str.charAt(-1));//SIOB
		
		System.out.println(str.indexOf('h'));//0
		System.out.println(str.indexOf('i'));//1 -- 1st occurrence of i
		
		System.out.println(str.indexOf('i', str.indexOf('i')+1)); //2nd occurrence of i

		
		int p2 = str.indexOf('i', str.indexOf('i')+1);
		System.out.println(p2);
		
		System.out.println(str.indexOf('i', p2+1));//8
		
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1));//8
		
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("python"));//-1
		
		String mesg = "welcome naveen";
		System.out.println(mesg.indexOf("naveen"));
		
		if(mesg.indexOf("naveen") == 8) {
			System.out.println("admin is present -- PASS");
		}
		else {
			System.out.println("admin not present -- FAIL");
		}

		String m1 = "By creating an account you will be able to shop faster, "
				+ "be up to date on an order's status, "
				+ "and keep track of the orders you have previously made";
		
		if(m1.indexOf("shop faster")>=0) {
			System.out.println("PASS");
		}

		
		//
		String t1 = "   hello world   ";
		System.out.println(t1.trim());
		System.out.println(t1);
		
		//
		//Lower case and upperCase:
		
		String l1 = "hello java world";
		System.out.println(l1.toUpperCase());
		System.out.println(l1.toLowerCase());
		
		//replace:
		String dob = "01-01-1990"; //01/01/1990
		System.out.println(dob.replace("-", "/"));
		
		String t2 = "   hello world   ";
		System.out.println(t2.replace(" ", ""));
		
		//contains:
		String test = "I love Java coding";
		System.out.println(test.contains("Java"));
		System.out.println(test.contains("java"));

		if(test.contains("Java")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		//equals:
		String r1 = "Hello Selenium";
		String r2 = "Hello selenium ";
		
		System.out.println(r1.equals(r2));//false
		System.out.println(r1.equalsIgnoreCase(r2.trim()));//true
		
		//split:
		String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";
		
		String lg[] = lang.split("_");
		System.out.println(lg[0]);
		System.out.println(lg.length);
		System.out.println(Arrays.toString(lg));
		
		
		String pop = "xXHelloXxXSeleniumxXTestingXxXGoogleX";
		String pp[] = pop.split("xX");//0-4
		
		System.out.println(pp[0]);//nothing
		System.out.println(pp[1]);
		System.out.println(pp[2]);
		System.out.println(pp[3]);
		System.out.println(pp[4]);
		//System.out.println(pp[5]);//AIOB

		System.out.println(Arrays.toString(pp));

		System.out.println("naveen;automation;labs".split(";")[0]);//naveen
		
		
		String otp = "your otp number is 12345";
		String ot[] = otp.split(" ");
		System.out.println(ot[ot.length-1]);
		
		
		
		
		
		
		
	}
	
	
	

}
