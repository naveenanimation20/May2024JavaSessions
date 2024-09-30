package DataConversation;

import java.util.Arrays;


public class DataConvert {
	
	int i;

	public static void main(String[] args) {

		// String to int:
		String x = "100";
		System.out.println(x + 20);// 10020

		int i = Integer.parseInt(x);// 100
		System.out.println(i + 20);

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		String y = "100A";
		int j = Integer.parseInt(y.replace("A", ""));// 100A --//NumberFormatException
		System.out.println(j + 20);

		String totalPrice = "1000";
		int price = Integer.parseInt(totalPrice);// 1000
		System.out.println(price - 100);

		// String to double:
		String s = "100.33";
		System.out.println(s + 20);
		double d = Double.parseDouble(s);// 100.33
		System.out.println(d + 20);

		// int to String:
		int t = 100;
		System.out.println(t + 20);// 120
		String e = String.valueOf(t);// "100"
		System.out.println(e + 20);// 10020

		// double to String:
		double marks = 200.33;
		String m1 = String.valueOf(marks);// "200.33"
		System.out.println(m1 + 20);// 200.3320

		char ch = 'A';
		String cs = String.valueOf(ch);// "A"
		System.out.println(cs + 20);

		// String to boolean:
		String tr = "True";// true/TRUE/True
		boolean flag = Boolean.parseBoolean(tr); // true
		System.out.println(flag);// true
		if (flag) {
			System.out.println("PASSS");
		} else {
			System.out.println("FAIL");
		}

		// boolean to String:
		boolean gr = true;

		String yr = String.valueOf(gr);// "true"
		System.out.println(yr + 20);// true20

		// char array to String
		char cd[] = { 's', 'e', 'l', 'e', 'n', 'i', 'u', 'm' };
		String td = String.valueOf(cd);
		System.out.println(td);// selenium

//		String ar[] = {"Java", "Python", "Ruby"};
//		String arr = String.valueOf(ar);
//		System.out.println(arr);

		Integer v = 100;
		Integer v2 = 100;

		if (v == v2) {
			System.out.println("hi");
		}
		if (v.equals(v2)) {
			System.out.println("hello");
		}

		System.out.println(v + 20);// 120
		int v1 = v.intValue();
		System.out.println(v1);
		
		//primitive data compare: ==
		//non primitive data compare: .equals
		
		//
		String rest = "I love \"java code\" and \"selenium\" programming";// I love "java" code
		System.out.println(rest);

		String xpath = "//input[@name=\"naveen\"]";
		System.out.println(xpath);
		
		String data = "Vibha.Srivastava.989898989.Pune.India";
		String info[] = data.split("\\.");
		System.out.println(Arrays.toString(info));
		
		//int ---> Integer
		//double ---> Double
		//boolean ---> Boolean
		
		//String 
		Integer u = 10;//4 bytes
		System.out.println(u.byteValue());
		
		int uu = 100;//4 bytes
		
		String p1 = "java";
		String p2 = "java";
		System.out.println(p2.compareTo(p1));
		
		long l = 077777777777L;//octal number (0-7)
		System.out.println(l);
		
		//octal number to decimal number: base 8
		
		// 053 = (0 × 8²) + (5 × 8¹) + (3 × 8⁰) = 0 + 40 + 3 = 43
		// 07 = (0 × 8¹) + (7 × 8⁰) = 7
		// 0777 = (0 × 8³) + (7 × 8²) + (7 × 8¹) + (7 × 8⁰) = 511
		

	}

}
