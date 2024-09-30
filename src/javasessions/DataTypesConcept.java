package javasessions;

public class DataTypesConcept {

	public static void main(String[] args) {

		
		//data types:
		//1. primitive data types: all are reserved data types
		
		
		//Numeric Type:
			//Integral value
					//Integer: byte, short, int, long
					//floating-type: float, double
			//character: char: $ a 1
		//Boolean type: boolean(true/false)
		
		
		//2. non primitive data types: class, interface, arrays, object, String
		
		
		//1. byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127 (-2^7 to 2^7-1 )
		byte b = 10;
		 b = 20;
		System.out.println(b);
		byte c = 100;
		byte c1 = -20;
		//byte c2 = -130;
		System.out.println(c1);
		System.out.println(c);
		
		//2. short:
		//size: 2 bytes = 2x8 = 16 bits
		//range: -32768 to 32767 (-2^15 to 2^15-1)
		short sh = 600;
		short bh = 120;
		System.out.println(sh);
		short gh = 1;//2 bytes
		short h = 400;
		
		
		//3. int
		//size: 4 bytes = 4x8 = 32 bits
		//range: -2147483648 to 2147483647 (-2^31 to 2^31-1)
		
		int i = 10000;
		int j = 1;//4 bytes
				
		
		//4. long
		//size: 8 bytes = 8x8 = 64 bits
		//range: -2^63 to 2^63-1
		long num = 19898877776L;
		System.out.println(num);
		long dist = 9887776666L;
		
        double numDouble = Math.pow(2, 63);
        System.out.println((long)numDouble);
		System.out.println(Long.MAX_VALUE);
		
		//mobile, ssn, aadhar card, account number
		
		//4. float:
		//size: 4 bytes = 4x8 = 32 bits
		//range: after . it can take upto 6-7 decimal digits
		float n = 12.33f;//4 bytes
		float n1 = (float)12.45;
		System.out.println(n);
		System.out.println(n1);
		float n2 = 100;
		System.out.println(n2);//100.0
		
		
		//5. double:
		//size: 8 bytes = 64 bits
		//range: after . it can take upto 15 decimal digits
		double de = 12.33; //8 bytes
		
		double df = 125;
		System.out.println(df);//125.0
		
		
		//6. char: 1 digit value: unicode values + ASCII value
		//size: 2 bytes = 16 bits
		char ch = 'a';
		System.out.println(ch);
		char ch1 = '1';//0-9
		System.out.println(ch1);
		char ch2 = '$';
		System.out.println(ch2);
		
		System.out.println('t');
		System.out.println('t'+10);//126
		
		//7. boolean: true/false
		//size: ~1 bit
		//range: true/false
		boolean bl = true;
		System.out.println(bl);
		
		float tt = 340282350000000000000000000000000000000f;//39
		//309
		double ddd = 179769313486231570000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000d;

	}

}
